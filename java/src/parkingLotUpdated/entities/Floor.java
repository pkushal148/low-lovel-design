package parkingLotUpdated.entities;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Floor {
    private String id;
    private Map<String, Spot> spots;

    public Floor(String id) {
        this.id = id;
        spots = new HashMap<>();
    }

    public void addSpot(Spot spot) {
        spots.put(spot.getId(), spot);
    }

    public Optional<Spot> findSpot(Vehicle vehicle){
        return spots.values()
                .stream()
                .filter(spot -> spot.isSpotAvailable() && spot.canFitVehicle(vehicle))
                .findFirst();

    }
}
