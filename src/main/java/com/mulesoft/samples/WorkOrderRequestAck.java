package com.mulesoft.samples;

public class WorkOrderRequestAck {

	
    protected String workOrderID;
	protected boolean status;
    
	public void setWorkOrderID(String workOrderID) {
		this.workOrderID = workOrderID;
	}
	
	public String getWorkOrderID() {
		return workOrderID;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public boolean getStatus() {
		return status;
	}
}
