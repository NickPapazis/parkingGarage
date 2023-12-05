import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    
   //fields for parking lot class
   private int numberOfLevels;
   private List<List<ParkingSpot>> parkingSpots; //list of spots in lot
   private List<Vehicle> parkedVehicles; //track parked vehicles
   private Map<Vehicle, Attendant> parkingActivities; // track parking activities
   

   //args constructor
   public ParkingLot(int numberOfLevels, int spotsPerLevel)
   {
        this.numberOfLevels = numberOfLevels;
        this.parkingSpots = new ArrayList<>();
        this.parkedVehicles = new ArrayList<>();
        this.parkingActivities = new HashMap<>(); 

        //Initialize parking spots for each level
        for(int level = 0; level < numberOfLevels; level++)
        {
            List<ParkingSpot> levelSpots = new ArrayList<>();
            for(int spotNumber = 1; spotNumber <= spotsPerLevel; spotNumber++)
            {
                levelSpots.add(new ParkingSpot(spotNumber, level));
            }
            parkingSpots.add(levelSpots);
        }
   }

   //method for getting next available parking spot
   public String findParkingSpot(Vehicle vehicle)
   {
        for(int level = 0; level < numberOfLevels; level++)//iterates through each level 
        {
            for(ParkingSpot spot : parkingSpots.get(level))//iterates through each spot
            {
                if(!spot.isOccupied())//checks if spot is occupied
                {
                    spot.occupySpot();//occupies spot
                    vehicle.setAssignedSpot(spot);//assigns vehicle to spot
                    System.out.println();
                    return spot.toString(); //breaks out of loop once vehicle is parked
                }
            }
        }
        System.out.println();
        return "Parking lot is full. Cannot park vehicle: " + vehicle.getVehicleId();
   }

   //method for just returning the found parking spot
  

   //method for parking vehicle and record the attendant
   public void parkVehicle(Vehicle vehicle, Attendant attendant)
   {
        
                    findParkingSpot(vehicle);
                    parkedVehicles.add(vehicle);
                    vehicle.park();
                    System.out.println("Vehicle parked: " + vehicle.getVehicleId());
                    System.out.println();
                    if(attendant !=null)
                    {
                        vehicle.setParkedBy(attendant);
                        parkingActivities.put(vehicle, attendant);
                        System.out.println("Vehicle parked by " + attendant.getName());
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("Vehicle " + vehicle.getVehicleId() + " self parked");
                        System.out.println();
                    }
         

    }

   //method for retrieving a vehicle and recording the attendant
   public void retrieveVehicle(Vehicle vehicle, Attendant attendant)
   {
        if(parkedVehicles.contains(vehicle))//checks if vehicle is in parkinglot
        {
            parkedVehicles.remove(vehicle);//removes vehicle from list
            System.out.println("Vehicle retrieved: " + vehicle.getVehicleId());
            System.out.println();
        }
        else{
            System.out.println("Vehicle not found in the parking lot: " + vehicle.getVehicleId());
            System.out.println();
        }
        parkingActivities.remove(vehicle);//removes vehicle from list
   }

   //method to get parking activities
   public Map<Vehicle, Attendant> getParkingActivities()//hashmap that contains which attendant parked each car.
   {
        return parkingActivities;
   }

   //method to sort vehicles by ID
   public void sortVehiclesById()
   {
        //sorts list using comparator and lambdas
        parkedVehicles.sort(Comparator.comparing(Vehicle::getVehicleId));
        List<Vehicle> sortedByVehicleId = parkedVehicles;
        System.out.println("Vehicles sorted by ID");
        System.out.println(sortedByVehicleId);
        System.out.println();
   }
   
   //method to sort vehicles by brand
   public void sortVehiclesByBrand()
   {
        //sorts list using comparator and lambdas
        parkedVehicles.sort(Comparator.comparing(Vehicle::getBrand));
        List<Vehicle> sortedByBrand = parkedVehicles;
        System.out.println("Vehicles sorted by brand");
        System.out.println(sortedByBrand);
        System.out.println();
   }
   
   //method to sort vehicles by model
   public void sortVehiclesByModel()
   {
        //sorts list using comparator and lambdas
        parkedVehicles.sort(Comparator.comparing(Vehicle::getModel));
        List<Vehicle> sortedByModel = parkedVehicles;
        System.out.println("Vehicles sorted by model");
        System.out.println(sortedByModel);
        System.out.println();

   }
  
   //method to sort vehicles by parking duration
   public void sortVehiclesByParkingDuration()
   {
        //sorts list using comparator and lambdas
        parkedVehicles.sort(Comparator.comparing(Vehicle::getParkingDuration));
        List<Vehicle> sortedByParkingDuration = parkedVehicles;
        System.out.println("Vehicles sorted by parkingDuration");
        System.out.println(sortedByParkingDuration);
        System.out.println();

   }

    
}