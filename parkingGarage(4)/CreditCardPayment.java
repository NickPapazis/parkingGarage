public class CreditCardPayment implements Payment{
    
    //fields
    private double hourlyRate;

    //args constructor
    public CreditCardPayment(double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    // defines the method from the Payment interface
    @Override
    public void processPayment(Vehicle vehicle)
    {
        System.out.println("Payment Amount for Vehicle " + vehicle.getVehicleId() + ": $" +
        vehicle.getParkingDuration() * hourlyRate + " (Credit Card)");
        System.out.println();
    }

}
