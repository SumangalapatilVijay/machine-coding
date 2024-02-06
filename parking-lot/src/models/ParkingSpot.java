package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot {
    private int slotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;
    private ParkingFloor parkingFloor;
    private Vehicle vehicle;
    public ParkingSpot(int slotNumber,VehicleType vehicleType,ParkingFloor parkingFloor) {
        this.slotNumber = slotNumber;
        this.parkingSpotStatus = ParkingSpotStatus.AVAILABLE;
        this.vehicleType = vehicleType;
        this.parkingFloor = parkingFloor;
    }
}
