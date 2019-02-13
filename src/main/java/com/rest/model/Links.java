package com.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="links")
public class Links {

	@Id
 	@Column
 	@GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
}
