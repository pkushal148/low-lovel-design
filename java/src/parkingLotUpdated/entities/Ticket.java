package parkingLotUpdated.entities;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    private String id;
    private Vehicle vehicle;
    private Spot spot;
    private long entry;
    private long exit;

    public Ticket( Vehicle vehicle, Spot spot) {
        this.id = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.spot = spot;
        this.entry = new Date().getTime();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Spot getSpot() {
        return spot;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public long getEntry() {
        return entry;
    }

    public void setEntry(long entry) {
        this.entry = entry;
    }

    public long getExit() {
        return exit;
    }

    public void setExit() {
        this.exit = new Date().getTime();
    }
}
