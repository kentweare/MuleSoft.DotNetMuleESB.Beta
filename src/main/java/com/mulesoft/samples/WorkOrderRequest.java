package com.mulesoft.samples;
import java.util.Date;

public class WorkOrderRequest {

		protected String machineName;
	    protected int machineID;
	    protected String plant;
	    protected String functionalLocation;
	    protected String maintenanceType;
	    protected Date requestDate;
	    protected String workOrderID;
		 
	    
		public String getMachineName() {
			return machineName;
		}
		
		public void setMachineName(String machineName) {
			this.machineName = machineName;
		}
		
		public int getMachineID()
		{	
			return machineID;
		}
		
		public void setMachineID(int machineID)
		{
			this.machineID = machineID;
		}
		
		public String getPlant()
		{
			return plant;
		}
		
		public void setPlant(String plant)
		{
			this.plant = plant;
		}
		
		public String getFunctionalLocation() {
			return functionalLocation;
		}
		
		public void setFunctionalLocation(String functionalLocation) {
			this.functionalLocation = functionalLocation;
		}
		
		public String getMaintenanceType() {
			return maintenanceType;
		}
		
		public void setMaintenanceType(String maintenanceType) {
			this.maintenanceType = maintenanceType;
		}
		
		public Date getRequestDate() {
			return requestDate;
		}
		
		public void setRequestDate(Date requestDate) {
			this.requestDate = requestDate;
		}
		
		public void setWorkOrderID(String workOrderID) {
			this.workOrderID = workOrderID;
		}
		
		public String getWorkOrderID() {
			return workOrderID;
		}
	}


