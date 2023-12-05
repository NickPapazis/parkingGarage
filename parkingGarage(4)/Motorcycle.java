public class Motorcycle extends Vehicle{
    
    public Motorcycle(String vehicleId, String brand, String model, int parkingDuration)
    {
        super(vehicleId, brand, model, parkingDuration);
    }

    @Override
    public void park()
    {
        System.out.println("Parking motorcycle " + getVehicleId());
        System.out.println();
    }

}
