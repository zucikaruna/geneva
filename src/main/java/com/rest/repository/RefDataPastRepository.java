package com.rest.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rest.model.RefDataPast;

@Repository
public interface RefDataPastRepository extends CrudRepository<RefDataPast, Integer>{

	 @Query("SELECT t FROM RefDataPast t WHERE t.created_on = :created_on")
	    public List<RefDataPast> findByDateCreated(@Param("created_on") Date date);
}
