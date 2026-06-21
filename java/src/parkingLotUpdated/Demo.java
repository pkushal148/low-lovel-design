package parkingLotUpdated;

import parkingLotUpdated.entities.*;
import parkingLotUpdated.strategies.FirstFind;
import parkingLotUpdated.strategies.FlatFee;

import java.util.Optional;

public class Demo {

    public static void main(String[] args) {

        ParkingLot parkingLot = ParkingLot.getInstance();

        Floor floor1 = new Floor("1");

        floor1.addSpot(new Spot("F1-S1", VehicleSize.TWO));
        floor1.addSpot(new Spot("F1-M1", VehicleSize.FOUR));
        floor1.addSpot(new Spot("F1-L1", VehicleSize.SIX));

        Floor floor2 = new Floor("2");

        floor2.addSpot(new Spot("F2-S1", VehicleSize.TWO));
        floor2.addSpot(new Spot("F2-M1", VehicleSize.FOUR));

        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        parkingLot.setParkingStrategy(new FirstFind());
        parkingLot.setFeeStrategy(new FlatFee());

        Vehicle bike = new Bike("B-123");
        Vehicle car = new Car("C-456");

        Optional<Ticket> bikeTicket = parkingLot.parkVehicle(bike);

        Optional<Ticket> carTicket = parkingLot.parkVehicle(car);

        if(bikeTicket.isPresent())
        {
            double d = parkingLot.unparkVehicle(bike.getId());
            System.out.println("fee for paking: ");
            System.out.print(d);
        }

    }
}
