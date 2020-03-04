package com.martinloyd.springbatch.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "federal_forecast_test")
public class DHS {

	@Id
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String listing_id; 
	private String title;
	private String description; 
	private String agency; 
	private String organization; 
	private String region; 
	private String pop_city; 
	private String pop_state; 
	private String pop_country; 
	private String naics_code; 
	private String requirement_type; 
	private String base_all_options; 
	private String base_all_options_value; 
	private String award_status; 
	private String est_contract_value_min; 
	private String est_contract_value_max; 
	private String task_del_order_dollar_amount; 
	private String current_fy_proj_obl; 
	private String fund_source; 
	private String est_award_fiscal_quarter; 
	private String est_award_fiscal_year; 
	private String est_solicitation_date;
	private String link_to_solicitation; 
	private String period_of_perform_start; 
	private String period_of_perform_end; 
	private String ultimate_completion_date; 
	private String current_completion_date; 
	private String acquisition_strategy_type; 
	private String contract_type; 
	private String procurement_method;
	private String extent_competed; 
	private String contractor_name; 
	private String awarded_contract_order; 
	private String type_of_awardee; 
	private String award_type; 
	private String listing_manager_email; 
	private String point_of_contact_name; 
	private String point_of_contact_email; 
	private String small_bus_specialist; 
	private String additional_info; 
	private String last_modified_date;
	private String published;
	private String poc_phone;
	private String data_source;
	public String getData_source() {
		return data_source;
	}
	public void setData_source(String data_source) {
		this.data_source = data_source;
	}
	public String getListing_id() {
		return listing_id;
	}
	public void setListing_id(String listing_id) {
		this.listing_id = listing_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPop_city() {
		return pop_city;
	}
	public void setPop_city(String pop_city) {
		this.pop_city = pop_city;
	}
	public String getPop_state() {
		return pop_state;
	}
	public void setPop_state(String pop_state) {
		this.pop_state = pop_state;
	}
	public String getPop_country() {
		return pop_country;
	}
	public void setPop_country(String pop_country) {
		this.pop_country = pop_country;
	}
	public String getNaics_code() {
		return naics_code;
	}
	public void setNaics_code(String naics_code) {
		this.naics_code = naics_code;
	}
	public String getRequirement_type() {
		return requirement_type;
	}
	public void setRequirement_type(String requirement_type) {
		this.requirement_type = requirement_type;
	}
	public String getBase_all_options() {
		return base_all_options;
	}
	public void setBase_all_options(String base_all_options) {
		this.base_all_options = base_all_options;
	}
	public String getBase_all_options_value() {
		return base_all_options_value;
	}
	public void setBase_all_options_value(String base_all_options_value) {
		this.base_all_options_value = base_all_options_value;
	}
	public String getAward_status() {
		return award_status;
	}
	public void setAward_status(String award_status) {
		this.award_status = award_status;
	}
	public String getEst_contract_value_min() {
		return est_contract_value_min;
	}
	public void setEst_contract_value_min(String est_contract_value_min) {
		this.est_contract_value_min = est_contract_value_min;
	}
	public String getEst_contract_value_max() {
		return est_contract_value_max;
	}
	public void setEst_contract_value_max(String est_contract_value_max) {
		this.est_contract_value_max = est_contract_value_max;
	}
	public String getTask_del_order_dollar_amount() {
		return task_del_order_dollar_amount;
	}
	public void setTask_del_order_dollar_amount(String task_del_order_dollar_amount) {
		this.task_del_order_dollar_amount = task_del_order_dollar_amount;
	}
	public String getCurrent_fy_proj_obl() {
		return current_fy_proj_obl;
	}
	public void setCurrent_fy_proj_obl(String current_fy_proj_obl) {
		this.current_fy_proj_obl = current_fy_proj_obl;
	}
	public String getFund_source() {
		return fund_source;
	}
	public void setFund_source(String fund_source) {
		this.fund_source = fund_source;
	}
	public String getEst_award_fiscal_quarter() {
		return est_award_fiscal_quarter;
	}
	public void setEst_award_fiscal_quarter(String est_award_fiscal_quarter) {
		this.est_award_fiscal_quarter = est_award_fiscal_quarter;
	}
	public String getEst_award_fiscal_year() {
		return est_award_fiscal_year;
	}
	public void setEst_award_fiscal_year(String est_award_fiscal_year) {
		this.est_award_fiscal_year = est_award_fiscal_year;
	}
	public String getEst_solicitation_date() {
		return est_solicitation_date;
	}
	public void setEst_solicitation_date(String est_solicitation_date) {
		this.est_solicitation_date = est_solicitation_date;
	}
	public String getLink_to_solicitation() {
		return link_to_solicitation;
	}
	public void setLink_to_solicitation(String link_to_solicitation) {
		this.link_to_solicitation = link_to_solicitation;
	}
	public String getPeriod_of_perform_start() {
		return period_of_perform_start;
	}
	public void setPeriod_of_perform_start(String period_of_perform_start) {
		this.period_of_perform_start = period_of_perform_start;
	}
	public String getPeriod_of_perform_end() {
		return period_of_perform_end;
	}
	public void setPeriod_of_perform_end(String period_of_perform_end) {
		this.period_of_perform_end = period_of_perform_end;
	}
	public String getUltimate_completion_date() {
		return ultimate_completion_date;
	}
	public void setUltimate_completion_date(String ultimate_completion_date) {
		this.ultimate_completion_date = ultimate_completion_date;
	}
	public String getCurrent_completion_date() {
		return current_completion_date;
	}
	public void setCurrent_completion_date(String current_completion_date) {
		this.current_completion_date = current_completion_date;
	}
	public String getAcquisition_strategy_type() {
		return acquisition_strategy_type;
	}
	public void setAcquisition_strategy_type(String acquisition_strategy_type) {
		this.acquisition_strategy_type = acquisition_strategy_type;
	}
	public String getContract_type() {
		return contract_type;
	}
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	public String getProcurement_method() {
		return procurement_method;
	}
	public void setProcurement_method(String procurement_method) {
		this.procurement_method = procurement_method;
	}
	public String getExtent_competed() {
		return extent_competed;
	}
	public void setExtent_competed(String extent_competed) {
		this.extent_competed = extent_competed;
	}
	public String getContractor_name() {
		return contractor_name;
	}
	public void setContractor_name(String contractor_name) {
		this.contractor_name = contractor_name;
	}
	public String getAwarded_contract_order() {
		return awarded_contract_order;
	}
	public void setAwarded_contract_order(String awarded_contract_order) {
		this.awarded_contract_order = awarded_contract_order;
	}
	public String getType_of_awardee() {
		return type_of_awardee;
	}
	public void setType_of_awardee(String type_of_awardee) {
		this.type_of_awardee = type_of_awardee;
	}
	public String getAward_type() {
		return award_type;
	}
	public void setAward_type(String award_type) {
		this.award_type = award_type;
	}
	public String getListing_manager_email() {
		return listing_manager_email;
	}
	public void setListing_manager_email(String listing_manager_email) {
		this.listing_manager_email = listing_manager_email;
	}
	public String getPoint_of_contact_name() {
		return point_of_contact_name;
	}
	public void setPoint_of_contact_name(String point_of_contact_name) {
		this.point_of_contact_name = point_of_contact_name;
	}
	public String getPoint_of_contact_email() {
		return point_of_contact_email;
	}
	public void setPoint_of_contact_email(String point_of_contact_email) {
		this.point_of_contact_email = point_of_contact_email;
	}
	public String getSmall_bus_specialist() {
		return small_bus_specialist;
	}
	public void setSmall_bus_specialist(String small_bus_specialist) {
		this.small_bus_specialist = small_bus_specialist;
	}
	public String getAdditional_info() {
		return additional_info;
	}
	public void setAdditional_info(String additional_info) {
		this.additional_info = additional_info;
	}
	public String getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(String last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	public String getPoc_phone() {
		return poc_phone;
	}
	public void setPoc_phone(String poc_phone) {
		this.poc_phone = poc_phone;
	}
	
  
    
}
