public class CashPayment implements Payment{
    
    //field for hourlyRate
    private double hourlyRate;

    //args constructor
    public CashPayment(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }


    //defines the method from the Payment interface 
    @Override
    public void processPayment(Vehicle vehicle)
    {
        System.out.println("Payment Amount for Vehicle " + vehicle.getVehicleId() + ": $" +
        vehicle.getParkingDuration() * hourlyRate + " (Cash)");
        System.out.println();
    }
}
