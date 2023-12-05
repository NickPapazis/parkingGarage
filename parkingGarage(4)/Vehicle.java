public abstract class Vehicle{
    
    //instance variables for abstract vehicle
    private String vehicleId;
    private String brand;
    private String model;
    private double parkingDuration;
    private ParkingSpot assignedSpot;
    private Attendant parkedBy;

    //args constructor
    public Vehicle(String vehicleId, String brand, String model, int parkingDuration)
    {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.parkingDuration = parkingDuration;
    
    }

    //getters
    public String getVehicleId()
    {
        return vehicleId;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public double getParkingDuration()
    {
        return parkingDuration;
    }

    public ParkingSpot getAssignedSpot()
    {
        return assignedSpot;
    }

    public Attendant getParkedBy()
    {
        return parkedBy;
    }

    //setters
    public void setAssignedSpot(ParkingSpot assignedSpot)
    {
        this.assignedSpot = assignedSpot;
    }

    public void setParkedBy(Attendant parkedBy)
    {
        this.parkedBy = parkedBy;
    }

    //toString
    @Override
    public String toString()
    {
        return vehicleId;
    }

    //abstract method for parking
    public abstract void park();

    
}
