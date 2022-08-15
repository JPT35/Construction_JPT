/**
 * 
 * @author johnpaulthomas
 * Residential Class 
 * Inherits from Building 
 * Super class for Apartment class and SingleFamilyHome class
 */
public class Residential extends Building{

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	/**
	 * empty argument constructor
	 */
	public Residential() {
		
		super();
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
		
	}//end empty 
	/**
	 * preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.setNumBedrooms(numBedrooms);
		this.setNumBathrooms(numBathrooms);
		this.setLaundryRoom(laundryRoom);
		
	}//end preferred constructor
	/**
	 * getter for NumBedRooms
	 * @return
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms
/**
 * setter for NumBedRooms
 * @param numBedrooms
 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms
/**
 * getter for NumBathrooms
 * @return
 */
	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms
/**
 * setter for NumBathrooms
 * @param numBathrooms
 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms
/**
 * boolean isLaundryRoom
 * @return
 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRooom
/**
 * setter for LaundryRoom
 * @param laundryRoom
 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
/**
 * draw method 	
 */
public void draw() {
		
	}//end draw method
/**
 * displayData
 */
	public String displayData() {
		return ("Project Name: "+projectName+"\n"+"Addres: "+completeAddress+"\n"+"Total Square Feet: "+totalSquareFeet+"\n"+"Occupancy: "+occupancyGroup+"\n"+"Occupancy Sub Group: "+subGroup+"\n"+"Number of Bedrooms: "+numBedrooms+"\n"+"Number of Bathrooms: "+numBathrooms+"\n"+"Laundry Room? "+laundryRoom);

	}//end displayData
/**
 * toString
 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subGroup="
				+ subGroup + "]";
	}//end toString
	
}//end class
