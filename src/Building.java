
/**
 * 
 * @author johnpaulthomas
 *	Super class from which all other classes will inherit
 */
public class Building {

	protected String projectName = "";
	protected String completeAddress = "";
	protected double totalSquareFeet = 0.0;
	protected String occupancyGroup = "";
	protected String subGroup = "";
	protected String draw = "Drawing code for <<Object Type>>";
	/**
	 * empty argument constructor
	 */
	public Building() {
		
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupancyGroup = "";
		this.subGroup = "";
		this.draw = "";
	}//end empty constructor
	/**
	 * preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		
	this.setProjectName(projectName);
	this.setCompleteAddress(completeAddress);
	this.setTotalSquareFeet(totalSquareFeet);
	this.setOccupancyGroup(occupancyGroup);
	this.setSubGroup(subGroup);
	
	
	}//end preferred constructor 
/**
 * getter for ProjectName
 * @return
 */
	public String getProjectName() {
		return projectName;
	}//end getProjectName
/**
 * setter for ProjectName
 * @param projectName
 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName
/**
 * getter for CompleteAddress
 * @return
 */
	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress
/**
 * setter for CompleteAddress
 * @param completeAddress
 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress
/**
 * getter for TotalSquareFeet
 * @return
 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet
/**
 * setter for TotalSquareFeet
 * @param totalSquareFeet
 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet
/**
 * getter for OccupancyGroup 
 * @return
 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}//end getOccupancyGroup
/**
 * setter for OccupancyGroup
 * @param occupancyGroup
 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//end setOccupancyGroup
/**
 * getter for SubGroup
 * @return
 */
	public String getSubGroup() {
		return subGroup;
	}//end getSubGroup
/**
 * setter for SubGroup
 * @param subGroup
 */
	public void setSubGroup(String subGroup) {
		this.subGroup = subGroup;
	}//end setSubGroup
/**
 * draw method
 */
public void draw() {
		return;
	}//end draw method
/**
 * displayData method
 * @return
 */
	public String displayData() {
		return ("Project Name: "+projectName+"\n"+"Address: "+completeAddress+"\n"+"Square Feet: "+totalSquareFeet+"\n"+"Occupancy Group: "+occupancyGroup+"\n"+"Occupancy Subgroup: "+subGroup);
	}//end displayData
/**
 * toString method
 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup=" + subGroup + "]";
	}//end toString
	
}//end class