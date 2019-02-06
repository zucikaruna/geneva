package com.rest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeedetails")
public class EmployeeDetails  {
	
	@Id
	@Column(name = "uniqueId")
	private Integer uniqueId;
	@Column(name ="JobTitle")
	private String JobTitle;
	@Column(name = "Supervisor")
	private String Supervisor;
	@Column(name = "bankName")
	private String BankName;
	@Column(name = "CheckDeposit")
	private String CheckDeposit;
	@Column(name = "City")
	private String City;
	@Column
	private String CompanyName;
	@Column
	private Integer DOB_Year;
	@Column
	private String LicenseState;
	@Column
	private String State;
	@Column
	private Integer Zip;
	@Column
	private Integer TakeHomePay;
	@Column
	private String AccountType;
	@Column
	private String PayPeriod;
	@Column
	private String CurrentlyEmployed;
	@Column
	private Integer Months_At_Address;
	@Column
	private String IsMilitary;
	@Column
	private Boolean Existing;
	@Column
	private Integer RequestedAmount;
	
	public Integer getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(Integer uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public String getSupervisor() {
		return Supervisor;
	}
	public void setSupervisor(String supervisor) {
		Supervisor = supervisor;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getCheckDeposit() {
		return CheckDeposit;
	}
	public void setCheckDeposit(String checkDeposit) {
		CheckDeposit = checkDeposit;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Integer getDOB_Year() {
		return DOB_Year;
	}
	public void setDOB_Year(Integer dOB_Year) {
		DOB_Year = dOB_Year;
	}
	public String getLicenseState() {
		return LicenseState;
	}
	public void setLicenseState(String licenseState) {
		LicenseState = licenseState;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Integer getZip() {
		return Zip;
	}
	public void setZip(Integer zip) {
		Zip = zip;
	}
	public Integer getTakeHomePay() {
		return TakeHomePay;
	}
	public void setTakeHomePay(Integer takeHomePay) {
		TakeHomePay = takeHomePay;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public String getPayPeriod() {
		return PayPeriod;
	}
	public void setPayPeriod(String payPeriod) {
		PayPeriod = payPeriod;
	}
	public String getCurrentlyEmployed() {
		return CurrentlyEmployed;
	}
	public void setCurrentlyEmployed(String currentlyEmployed) {
		CurrentlyEmployed = currentlyEmployed;
	}
	public Integer getMonths_At_Address() {
		return Months_At_Address;
	}
	public void setMonths_At_Address(Integer months_At_Address) {
		Months_At_Address = months_At_Address;
	}
	public String getIsMilitary() {
		return IsMilitary;
	}
	public void setIsMilitary(String isMilitary) {
		IsMilitary = isMilitary;
	}
	public Boolean getExisting() {
		return Existing;
	}
	public void setExisting(Boolean existing) {
		Existing = existing;
	}
	public Integer getRequestedAmount() {
		return RequestedAmount;
	}
	public void setRequestedAmount(Integer requestedAmount) {
		RequestedAmount = requestedAmount;
	}
	
	

}
