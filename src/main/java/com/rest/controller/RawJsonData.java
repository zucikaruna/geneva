package com.rest.controller;

import org.springframework.web.bind.annotation.RestController;
import com.rest.model.EmployeeDetails;
import com.rest.model.RefData;
import com.rest.service.RawJsonDataService;
import com.rest.util.WriteDataToCSV;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/rawdata")
public class RawJsonData {

	@Autowired
	private RawJsonDataService rawJsonDataService;
	
	
	@GetMapping("/fetch/esh9")
	public List<EmployeeDetails> fetchRawJsonData() throws Exception {

		List<EmployeeDetails> employeeDetails = rawJsonDataService.fetchRawJsonData();
		if (!employeeDetails.isEmpty()) {
			return employeeDetails;
		} else {
			throw new Exception("Employee Details not found");
		}
	}
	
	@PostMapping("/fetchfile/refdata/{date}")
	public void fetchFileByDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date, HttpServletResponse response) throws Exception {
			//System.out.println(date);
		 Date currentDate = new Date();
	     long prevDay = System.currentTimeMillis() - 1000*60*60*24;
	     Date prevDate = new Date(prevDay);
		if(DateUtils.isSameDay(date, currentDate) || DateUtils.isSameDay(date, prevDate)) {
				List<RefData> refData = rawJsonDataService.fetchFileByDate(date);
				if (!refData.isEmpty()) {
					@SuppressWarnings("deprecation")
					String fileName = "refData_"+date.getYear()+date.getMonth()+date.getDate()+".csv";
					response.setContentType("application/csv");
					response.setHeader("Content-Disposition", "attachment; file="+fileName);
					WriteDataToCSV.writeDataToCsvWithListObjects(response.getWriter(), refData);
					//return response;
				} else {
					throw new Exception("Data is not found on this date");
				}
		}
		else {
			throw new Exception("Given date is inappropriate");
		}
	}
}
