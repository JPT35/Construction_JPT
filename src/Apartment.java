/**
 * 
 * @author johnpaulthomas
 * Apartment class inherits from Residential class
 */
public class Apartment extends Residential{

	protected int numRentableUnits;
	protected double avgUnitSize;
	protected boolean parkingAvailable;
	/**
	 * empty argument constructor
	 */
	public Apartment() {
		
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable =false;
		
	}//end empty 
	/**
	 * preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.setNumRentableUnits(numRentableUnits);
		this.setAvgUnitSize(avgUnitSize);
		this.setParkingAvailable(parkingAvailable);
		
	}//end preferred
	/**
	 * getter for NumRentableUnits
	 * @return
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getnumRentableUnits
/**
 * setter for NumRentableUnits
 * @param numRentableUnits
 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumrentableUnits
/**
 * getter for AvgUnitSize
 * @return
 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize
/**
 * setter for AvgUnitSize
 * @param avgUnitSize
 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize
/**
 *  boolean isParkingAvailable
 * @return
 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable
/**
 *  setter for ParkingAvailable
 * @param parkingAvailable
 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
/**
 * draw method
 */
	public void draw() {
		
	}//end draw method
	/**
	 * displayData method
	 */
	public String displayData() {
		return ("Project Name: "+projectName+"\n"+"Addres: "+completeAddress+"\n"+"Total Square Feet: "+totalSquareFeet+"\n"+"Occupancy: "+occupancyGroup+"\n"+"Occupancy Sub Group: "+subGroup+"\n"+"Rentable Units: "+numRentableUnits+"\n"+"Average Unit Size: "+avgUnitSize+"\n"+"Laundry Room? "+laundryRoom+"\n"+"Parking Available? "+parkingAvailable);

	}//end displayData

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString
	

}//end class