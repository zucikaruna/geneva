package com.rest.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.Collection;
import com.rest.model.RefData;
import com.rest.model.RefDataPast;
import com.rest.service.RawJsonDataService;
import com.rest.util.WriteDataToCSV;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
	public List<Collection> fetchRawJsonData() throws Exception {

		List<Collection> collection = rawJsonDataService.fetchRawJsonData();
		if (!collection.isEmpty()) {
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(collection);
			byte[] isr = json.getBytes();
			String fileName = "collection.json";
			HttpHeaders respHeaders = new HttpHeaders();
			respHeaders.setContentLength(isr.length);
			respHeaders.setContentType(new MediaType("text", "json"));
			respHeaders.setCacheControl("must-revalidate, post-check=0, pre-check=0");
			respHeaders.set(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + fileName);
			//return new ResponseEntity<byte[]>(isr, respHeaders, HttpStatus.OK);
			return collection;
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
		if(DateUtils.isSameDay(date, currentDate)) {
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
		else if(DateUtils.isSameDay(date, prevDate)) {
			List<RefDataPast> refDataPast = rawJsonDataService.fetchFileByPastDate(date);
			if (!refDataPast.isEmpty()) {
				@SuppressWarnings("deprecation")
				String fileName = "refData_"+date.getYear()+date.getMonth()+date.getDate()+".csv";
				response.setContentType("application/csv");
				response.setHeader("Content-Disposition", "attachment; file="+fileName);
				WriteDataToCSV.writePastDataToCsvWithListObjects(response.getWriter(), refDataPast);
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
