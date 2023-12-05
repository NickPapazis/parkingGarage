import java.time.LocalDateTime;

public class Ticket {
    
    //fields
    private String vehicleId;
    private String vehicleBrand;
    private String vehicleModel;
    public LocalDateTime checkInTime;

    //args constructor
    public Ticket(String vehicleId, String vehicleBrand, String vehicleModel, LocalDateTime checkInTime)
    {
        this.vehicleId = vehicleId;
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.checkInTime = LocalDateTime.now();
    }

    //getters
    public String getVehicleId()
    {
        return vehicleId;
    }

    public String getVehicleBrand()
    {
        return vehicleBrand;
    }

    public String getVehicleModel()
    {
        return vehicleModel;
    }

    public LocalDateTime getCheckInTime()
    {
        return checkInTime;
    }

    //toString method
    @Override
    public String toString()
    {
        return "Vehicle ID: " + vehicleId +"\n" + "Brand: " + vehicleBrand +  "\n" + "Model: " + vehicleModel + "\n"
        + "Check In Time: " + checkInTime;
    }
    
    
    
    

}
