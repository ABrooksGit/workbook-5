package com.pluralsight;

public class Vehicle {

    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;


    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    protected void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    protected int getCargoCapacity() {
        return cargoCapacity;
    }

    private void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    protected int getFuelCapacity() {
        return fuelCapacity;
    }

    protected void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
