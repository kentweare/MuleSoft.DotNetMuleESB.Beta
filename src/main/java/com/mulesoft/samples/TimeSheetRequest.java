package com.mulesoft.samples;


public class TimeSheetRequest {

		protected String EmployeeID;
	    protected int MachineID;
	    protected String PlantName;
	    protected double Cost = 0.00;

		 
	    
		public String getEmployeeID() {
			return EmployeeID;
		}
		
		public void setEmployeeID(String EmployeeID) {
			this.EmployeeID = EmployeeID;
		}
		
		public int getMachineID()
		{	
			return MachineID;
		}
		
		public void setMachineID(int MachineID)
		{
			this.MachineID = MachineID;
		}
		
		public String getPlantName()
		{
			return PlantName;
		}
		
		public void setPlantName(String PlantName)
		{
			this.PlantName = PlantName;
		}
		
		public double getCost() {
			return Cost;
		}
		
		public void setCost(double Cost) {
			this.Cost = Cost;
		}

	}