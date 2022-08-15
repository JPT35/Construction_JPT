
/**
 * 
 * @author johnpaulthomas
 *	SingleFamilyHomeClass inherits from Residential 
 *
 *
 */
public class SingleFamilyHome extends Residential{

	protected boolean garage;
	/**
	 * empty argument constructor
	 * 
	 */
	public SingleFamilyHome() {
		super();
		this.garage = false;
	}//end empty
	/**
	 * preferred constructor
	 * @param projectName
	 * @param completeAddress
	 * @param totalSquareFeet
	 * @param occupancyGroup
	 * @param subGroup
	 */
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subGroup) {
		
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subGroup);
		this.setGarage(garage);
		
	}//end preferred
	/**
	 * boolean isGarage
	 * @return
	 */
public boolean isGarage() {
		return garage;
	}//end isGarage
/**
 * setter for Garage
 * @param garage
 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage
/**
 * draw method
 */
public void draw() {
		this.draw = "Drawing code for <<Object Type>>";
	}//end draw method
/**
 * displayData method
 */
	public String displayData() {
		return "Project Name: "+projectName+"\n"+"Addres: "+completeAddress+"\n"+"Total Square Feet: "+totalSquareFeet+"\n"+"Occupancy: "+occupancyGroup+"\n"+"Occupancy Sub Group: "+subGroup+"\n"+"Number of Bedrooms: "+numBedrooms+"\n"+"Number of Bathrooms: "+numBathrooms+"\n"+"Laundry Room Available? "+laundryRoom+"\n"+"Garage Available? "+garage;
	}//end displayData
/**
 * toString method
 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subGroup=" + subGroup + "]";
	}//end toString
	
}//end class
