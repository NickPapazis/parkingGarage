import java.util.Map;

public class Main {
    public static void main(String[] args)
    {

        //create parking lot
        ParkingLot parkingLot = new ParkingLot(3, 5);

        //create attendants
        Attendant attendant1 = new Attendant("A001", "John Doe");
        Attendant attendant2 = new Attendant("A002", "Jane Smith");

        //create vehicles
        Vehicle car1 = new Car("ABC-123", "Toyota", "Camry", 1);
        Vehicle car2 = new Car("XYZ-789", "Honda", "Accord", 5);
        Vehicle motorcycle1 = new Motorcycle("M123", "Harley", "Sportster", 4);
        Vehicle motorcycle2 = new Motorcycle("G456", "Suzuki", "Cruiser", 2);
        Vehicle truck1 = new Truck("T321", "Ford", "F-150", 7);
        Vehicle truck2 = new Truck("H473", "Chevy", "Chevrolet", 8);

        //create ticketPrinter
        TicketPrinter ticketPrinter = new TicketPrinter();
        ticketPrinter.printTicket(car1, parkingLot); 
        ticketPrinter.printTicket(car2, parkingLot); 
        ticketPrinter.printTicket(motorcycle1, parkingLot); 
        ticketPrinter.printTicket(motorcycle2, parkingLot); 
        ticketPrinter.printTicket(truck1, parkingLot); 
        ticketPrinter.printTicket(truck2, parkingLot); 


        //park vehicles in the parking lot
        parkingLot.parkVehicle(car1, attendant1);
        parkingLot.parkVehicle(car2, null);
        parkingLot.parkVehicle(motorcycle1, attendant2);
        parkingLot.parkVehicle(motorcycle2, null);
        parkingLot.parkVehicle(truck1, attendant2);
        parkingLot.parkVehicle(truck2, null);

        //retrieve vehicle from the parking lot
        parkingLot.retrieveVehicle(car1, attendant1);
        parkingLot.retrieveVehicle(motorcycle2, null);
        parkingLot.retrieveVehicle(truck1, attendant2);

        //payment
        Payment creditCardPayment = new CreditCardPayment(10.0);
        creditCardPayment.processPayment(car1);
        creditCardPayment.processPayment(motorcycle1);
        creditCardPayment.processPayment(truck1);

        Payment cashPayment = new CashPayment(10.99);
        cashPayment.processPayment(car2);
        cashPayment.processPayment(motorcycle1);
        cashPayment.processPayment(truck1);
         

        //get parking activities
        Map<Vehicle, Attendant> parkingActivities = parkingLot.getParkingActivities();
        System.out.println("Parking Activities:");
        for (Map.Entry<Vehicle, Attendant> entry : parkingActivities.entrySet()) {
            System.out.println("Vehicle: " + entry.getKey().getVehicleId() +
                    ", Attendant: " + entry.getValue().getName());
        }
        System.out.println();

        //sorting vehicles by ID
        parkingLot.sortVehiclesById();

        //sort vehicles by brand
        parkingLot.sortVehiclesByBrand();

        //sort vehicles by model
        parkingLot.sortVehiclesByModel();

        //sort vehicles by parkingDuration
        parkingLot.sortVehiclesByParkingDuration();


    }
}
