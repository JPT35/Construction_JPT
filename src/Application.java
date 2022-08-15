/**
 * 
 * @author johnpaulthomas
 *CS131 Project 1 
 *This is the Application class to test the inheritance between classes
 *The super class for all other classes to inherit from is Building
 * 
 *
 */
public class Application {

	public static void main(String[] args) {
		
		Building building1 = new Building();
			
			System.out.println(building1.toString());
			
			building1.setProjectName("Gaines House");
			building1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
			building1.setTotalSquareFeet(2540);
			building1.setOccupancyGroup("Residential");
			building1.setSubGroup("R1");
			
			System.out.println(building1.displayData());
			System.out.println();
			
		Business business1 = new Business();
		
			System.out.println(business1.toString());
			business1.setProjectName("Gaines House");
			business1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
			business1.setTotalSquareFeet(2540);
			business1.setOccupancyGroup("Business");
			business1.setSubGroup("B");
			business1.setNumRentableUnits(20);
			
			System.out.println(business1.displayData());
			System.out.println();
			
		Mall mall1 = new Mall();
		
			System.out.println(mall1.toString());
			
			mall1.setProjectName("Gaines House");
			mall1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
			mall1.setTotalSquareFeet(2540);
			mall1.setOccupancyGroup("Business");
			mall1.setSubGroup("B");
			mall1.setNumRentableUnits(30);
			mall1.setNumRentedUnits(20);
			mall1.setMedianUnitSize(2000);
			mall1.setNumOfParkingSpaces(300);
			
			System.out.println(mall1.displayData());
			System.out.println();
			
		Apartment apartment1 = new Apartment();
		
			System.out.println(apartment1.toString());
			
			apartment1.setProjectName("Gaines House");
			apartment1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
			apartment1.setTotalSquareFeet(2540);
			apartment1.setOccupancyGroup("Residential");
			apartment1.setSubGroup("R1");
			apartment1.setNumRentableUnits(5);
			apartment1.setAvgUnitSize(900);
			apartment1.setParkingAvailable(true);
			apartment1.setLaundryRoom(false);
			
			
			System.out.println(apartment1.displayData());
			System.out.println();
			
		Residential residential1 = new Residential();
		
			System.out.println(residential1.toString());
			
			residential1.setProjectName("Gaines House");
			residential1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
			residential1.setTotalSquareFeet(2540);
			residential1.setOccupancyGroup("Residential");
			residential1.setSubGroup("R1");
			residential1.setNumBedrooms(4);
			residential1.setNumBathrooms(2);
			residential1.setLaundryRoom(true);
			
			System.out.println(residential1.displayData());
			System.out.println();
			
		SingleFamilyHome home1 = new SingleFamilyHome();
		
			System.out.println(home1.toString());
			
			home1.setProjectName("Gaines House");
			home1.setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
			home1.setTotalSquareFeet(2540);
			home1.setOccupancyGroup("Residential");
			home1.setSubGroup("R1");
			home1.setNumBathrooms(3);
			home1.setNumBedrooms(5);
			home1.setLaundryRoom(true);
			home1.setGarage(true);
			
			System.out.println(home1.displayData());
			
			System.out.println();

	}//end main

}//end class
