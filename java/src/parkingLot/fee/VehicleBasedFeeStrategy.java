package parkingLot.fee;

import parkingLot.Ticket;
import parkingLot.Vehicle.VehicleType;

import java.util.Map;

public class VehicleBasedFeeStrategy implements FeeStrategy {
    private final Map<VehicleType, Double> hourlyRates = Map.of(
            VehicleType.TWO_WHEELER, 20.0,
            VehicleType.FOUR_WHEELER, 10.0,
            VehicleType.EIGHT_WHEELER, 30.0
    );

    @Override
    public double calculateFee(Ticket ticket) {
        long duration = ticket.getExitTimestamp() - ticket.getEntryTimestamp();
        long hours = (duration / (1000 * 60 * 60)) + 1;
        return hours * hourlyRates.get(ticket.getVehicle().getVehicleType());
    }
}