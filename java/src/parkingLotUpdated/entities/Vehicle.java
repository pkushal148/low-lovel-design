package parkingLotUpdated.entities;

public abstract class Vehicle {
    private String id;
    private VehicleSize size;

    public Vehicle(String id, VehicleSize size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void setSize(VehicleSize size) {
        this.size = size;
    }
}
