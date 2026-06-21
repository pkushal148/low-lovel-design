package parkingLotUpdated.strategies;

import parkingLotUpdated.entities.Floor;
import parkingLotUpdated.entities.Spot;
import parkingLotUpdated.entities.Vehicle;

import java.util.List;
import java.util.Optional;

public class FirstFind implements Parking {
    @Override
    public Optional<Spot> findSpot(List<Floor> floors, Vehicle vehicle) {
        for (Floor floor : floors) {
            Optional<Spot> spot = floor.findSpot(vehicle);
            if (spot.isPresent()) {
                return spot;
            }
        }
        return Optional.empty();
    }
}
