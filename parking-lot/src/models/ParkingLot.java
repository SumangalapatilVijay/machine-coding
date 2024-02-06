package models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class ParkingLot {
    private String name;
    private String address;
    List<ParkingFloor> parkingFloorList;
    List<Gate> entryGates;
    List<Gate> exitGates;
    public ParkingLot(String name,
                      String address,
                      List<Gate> entryGates,
                      List<Gate> exitGates) {
        this.name = name;
        this.address = address;
        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        this.parkingFloorList = parkingFloorList;
        this.entryGates = entryGates;
        this.exitGates = exitGates;

    }


}
