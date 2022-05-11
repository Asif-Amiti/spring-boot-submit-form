package com.submitform.app.dto;

public class RegisterDetails {
	
	private String employeeName;
	private String employeeEmail;
	public RegisterDetails(String employeeName, String employeeEmail) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	@Override
	public String toString() {
		return "RegisterDetails [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + "]";
	}
	
	
}
