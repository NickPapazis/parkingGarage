import java.time.LocalDateTime;

public class TicketPrinter {
    
    //field
    private Ticket ticket;
    
    //no args constructor
    public TicketPrinter()
    {
        return;
    }

    //prints ticket for vehicle
    public Ticket printTicket(Vehicle vehicle, ParkingLot parkingLot)
    {
        ticket = new Ticket(vehicle.getVehicleId(), vehicle.getModel(), vehicle.getBrand(), LocalDateTime.now());
        System.out.println("Ticket for vehicle " + vehicle.getVehicleId() + ": \n" + ticket.toString() + 
        ": \n" +  "Assigned Spot: " + parkingLot.findParkingSpot(vehicle));
        System.out.println();
        return ticket;
    }


}
