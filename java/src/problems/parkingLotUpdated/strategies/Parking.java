package problems.parkingLotUpdated.strategies;

import problems.parkingLotUpdated.entities.Floor;
import problems.parkingLotUpdated.entities.Spot;
import problems.parkingLotUpdated.entities.Vehicle;

import java.util.List;
import java.util.Optional;

public interface Parking {
    Optional<Spot> findSpot(List<Floor> floor, Vehicle vehicle);
}
