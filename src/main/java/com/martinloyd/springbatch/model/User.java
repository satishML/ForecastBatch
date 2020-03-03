package com.martinloyd.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {

    @Id
    private String listing_id ;
    private String description;
    private String award_status ;
    private String funding_source;

	public String getListing_id() {
		return listing_id;
	}
	public void setListing_id(String listing_id) {
		this.listing_id = listing_id;
	}
	public String getFunding_source() {
		return funding_source;
	}
	public void setFunding_source(String funding_source) {
		this.funding_source = funding_source;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAward_status() {
		return award_status;
	}
	public void setAward_status(String award_status) {
		this.award_status = award_status;
	}
	
  
    
}
