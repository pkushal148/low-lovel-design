package parkingLotUpdated.strategies;

import parkingLotUpdated.entities.Floor;
import parkingLotUpdated.entities.Spot;
import parkingLotUpdated.entities.Vehicle;

import java.util.List;
import java.util.Optional;

public interface Parking {
    Optional<Spot> findSpot(List<Floor> floor, Vehicle vehicle);
}
