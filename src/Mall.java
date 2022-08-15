/**
 * 
 * @author johnpaulthomas
 *Mall class inherits from Business 
 */
public class Mall extends Business{

protected int numRentedUnits;
protected double medianUnitSize;
protected int numOfParkingSpaces;

/**
 * empty argument constructor
 */
public Mall() {
	
	super();
	this.numRentedUnits = 0;
	this.medianUnitSize = 0.0;
	this.numOfParkingSpaces = 0;
	
}//end empty
/**
 * preferred constructor
 * @param projectName
 * @param completeAddress
 * @param totalSquareFeet
 * @param occupancyGroup
 * @param subGroup
 */
public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
	
	super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
	this.setNumRentedUnits(numRentedUnits);
	this.setMedianUnitSize(medianUnitSize);
	this.setNumOfParkingSpaces(numOfParkingSpaces);
	
}//end preferred constructor
/**
 * getter for NumRentedUnits
 * @return
 */
public int getNumRentedUnits() {
	return numRentedUnits;
}//end getNumRentedUnits
/**
 * setter for NumRentedUnits
 * @param numRentedUnits
 */
public void setNumRentedUnits(int numRentedUnits) {
	this.numRentedUnits = numRentedUnits;
}//end setNumRentedUnits
/**
 * getter for MedianUnitSize
 * @return
 */
public double getMedianUnitSize() {
	return medianUnitSize;
}//end getMedianUnitSize
/**
 * setter for MedianUnitSize
 * @param medianUnitSize
 */
public void setMedianUnitSize(double medianUnitSize) {
	this.medianUnitSize = medianUnitSize;
}//endSetMedianUnitSize
/**
 * getter for NumOfParkingSpaces
 * @return
 */
public int getNumOfParkingSpaces() {
	return numOfParkingSpaces;
}//end getNumOfParkingSpaces
/**
 * setter for NumOfParkingSpaces
 * @param numOfParkingSpaces
 */
public void setNumOfParkingSpaces(int numOfParkingSpaces) {
	this.numOfParkingSpaces = numOfParkingSpaces;
}//end setNumOfParkingSpaces
/**
 * draw method
 */
public void draw() {
	
}//end draw method
/**
 * displayData method
 */
public String displayData() {
	return "Project Name: "+projectName+"\n"+"Addres: "+completeAddress+"\n"+"Total Square Feet: "+totalSquareFeet+"\n"+"Occupancy: "+occupancyGroup+"\n"+"Occupancy Sub Group: "+subGroup+"\n"+"Rented Units: "+numRentedUnits+"\n"+"Number of rentable units: "+numRentableUnits+"\n"+"Average Unit Size: "+medianUnitSize+"\n"+"Parking Spaces: "+numOfParkingSpaces;
}//end displayData
/**
 * toString method
 */
@Override
public String toString() {
	return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numOfParkingSpaces="
			+ numOfParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
			+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
			+ occupancyGroup + ", subGroup=" + subGroup + "]";
}//end toString

}//end class