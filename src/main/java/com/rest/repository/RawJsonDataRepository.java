package com.rest.repository;

import org.springframework.stereotype.Repository;

import com.rest.model.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RawJsonDataRepository extends JpaRepository<EmployeeDetails, Integer> {	
	

}
