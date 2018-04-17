package com.KOO.webPortfolio.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Portfolio {
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String title;
	
	

}
