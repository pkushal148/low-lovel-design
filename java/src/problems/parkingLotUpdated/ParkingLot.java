package problems.parkingLotUpdated;

import problems.parkingLotUpdated.entities.Floor;
import problems.parkingLotUpdated.entities.Spot;
import problems.parkingLotUpdated.entities.Ticket;
import problems.parkingLotUpdated.entities.Vehicle;
import problems.parkingLotUpdated.strategies.Fee;
import problems.parkingLotUpdated.strategies.FirstFind;
import problems.parkingLotUpdated.strategies.FlatFee;
import problems.parkingLotUpdated.strategies.Parking;

import java.util.*;

public class ParkingLot {
    private List<Floor> floors = new ArrayList<>();
    private Map<String, Ticket> tickets;
    private Fee fee;
    private Parking parking;
    private static ParkingLot instance;

    private ParkingLot() {
        this.fee = new FlatFee();
        this.parking = new FirstFind();
        this.tickets = new HashMap<>();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void setFeeStrategy(Fee feeStrategy){
        this.fee=feeStrategy;
    }

    public void setParkingStrategy(Parking parking){
        this.parking=parking;
    }

    public Optional<Ticket> parkVehicle(Vehicle vehicle)
    {
        Optional<Spot> spot=parking.findSpot(floors,vehicle);

        if(spot.isPresent()){
            Spot spot1=spot.get();
            String id = spot1.parkVehicle(vehicle);
            System.out.println("vehicle parked at "+id);
            Ticket ticket = new Ticket(vehicle,spot1);
            tickets.put(vehicle.getId(),ticket);
            return Optional.of(ticket);
        }
        return Optional.empty();
    }

    public Double unparkVehicle(String id){

        Ticket ticket = tickets.remove(id);
        ticket.setExit();

        ticket.getSpot().unParkVehicle();

        return fee.calculateFee(ticket);
    }
}
