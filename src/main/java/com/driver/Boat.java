package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implement getVehicleName method
    @Override
    public String getVehicleName() {
        return name;
    }

    // Implement getVehicleCapacity method
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
