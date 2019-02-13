package com.rest.repository;

import org.springframework.stereotype.Repository;
import com.rest.model.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RawJsonDataRepository extends JpaRepository<Collection, Integer> {	
	

}
