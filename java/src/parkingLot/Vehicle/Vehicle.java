package parkingLot.Vehicle;

public abstract class Vehicle {
    protected String regId;
    protected VehicleType vehicleType;

    public Vehicle(String regId,VehicleType vehicleType) {
        this.regId = regId;
        this.vehicleType = vehicleType;
    }

    public String getRegId() {
        return regId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}