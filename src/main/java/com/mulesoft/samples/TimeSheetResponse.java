package com.mulesoft.samples;



public class TimeSheetResponse {
	protected String EmployeeID;
    protected boolean Status;

	 
    
	public String getEmployeeID() {
		return EmployeeID;
	}
	
	public void setEmployeeID(String EmployeeID) {
		this.EmployeeID = EmployeeID;
	}
	
	public boolean getStatus() {
		return Status;
	}
	
	public void setStatus(boolean Status) {
		this.Status = Status;
	}
	
}
