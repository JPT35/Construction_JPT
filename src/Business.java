/**
 * 
 * @author johnpaulthomas
 * Business class will inherit from Building and be super class for mall class
 */
public class Business extends Building{

	protected int numRentableUnits;
	/**
	 * empty argument constructor
	 */
	public Business() {
		
		super();
		this.numRentableUnits = 0;
		
	}//end empty 
	/**
	 * preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.setNumRentableUnits(numRentableUnits);
		
	}//end preferred
	
	/**
	 * getter for NumRentAbleUnits
	 * @return
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits
/**
 * setter for NumrentableUnits
 * @param numRentableUnits
 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumrentableunits
/**
 * draw method
 */
	public void draw() {
		return;
	}//end draw method
	/**
	 * displayData method
	 */
	public String displayData() {
		
		String numOfRent =String.valueOf(getNumRentableUnits());
		
		return "Project Name: "+getProjectName()+"\n"+"Addres: "+getCompleteAddress()+"\n"+"Total Square Feet: "+getTotalSquareFeet()+"\n"+"Occupancy: "+getOccupancyGroup()+"\n"+"Occupancy Sub Group: "+getSubGroup()+"\n"+"Rentable Units: "+numOfRent;
	}//end displayData
/**
 * toString method
 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString
	
}//end class