package parkingLotUpdated.entities;

public class Spot {

    private String id;

    private boolean isOccupied;

    private VehicleSize size;

    private Vehicle parkedVehicle;

    public String getId() {
        return id;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public Spot(String id, VehicleSize size) {
        this.id = id;
        this.isOccupied = false;
        this.size = size;
        parkedVehicle=null;
    }

    public String parkVehicle(Vehicle vehicle)
    {
        this.isOccupied=true;
        this.parkedVehicle=vehicle;
        return id;
    }

    public void unParkVehicle()
    {
        this.isOccupied=false;
        this.parkedVehicle=null;
    }

    public boolean isSpotAvailable()
    {
        return !this.isOccupied;
    }

    public boolean canFitVehicle(Vehicle vehicle)
    {
        if(isOccupied)
        {
            return false;
        }
        return vehicle.getSize() == size;
    }
}
