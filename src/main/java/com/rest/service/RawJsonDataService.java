package com.rest.service;


import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.model.EmployeeDetails;
import com.rest.model.RefData;
import com.rest.model.RefDataPast;
import com.rest.repository.RawJsonDataRepository;
import com.rest.repository.RefDataPastRepository;
import com.rest.repository.RefDataRepository;

@Service
public class RawJsonDataService {
	
	@Autowired
	private RawJsonDataRepository rawJsonDataRepository;
	@Autowired
	private RefDataRepository refDataRepository;
	@Autowired
	private RefDataPastRepository refDataPastRepository;

	public List<EmployeeDetails> fetchRawJsonData() {
		List<EmployeeDetails> employeeDetails = rawJsonDataRepository.findAll();
	    return employeeDetails;
	}

	public List<RefData> fetchFileByDate(Date date) {
		List<RefData> refData =  (List<RefData>) refDataRepository.findByDateCreated(date);
		System.out.println(refData);
		return refData;
	}
	 
	public List<RefDataPast> fetchFileByPastDate(Date date) {
		List<RefDataPast> refDataPast =  (List<RefDataPast>) refDataPastRepository.findByDateCreated(date);
		System.out.println(refDataPast);
		return refDataPast;
	}
}
