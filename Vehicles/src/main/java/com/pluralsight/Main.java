package com.pluralsight;

public class Main {
    public static void main(String[] args) {


        Moped slowRide = new Moped();

        slowRide.setColor("Blue");
        slowRide.setFuelCapacity(54);
        slowRide.setNumberOfPassengers(22);


        System.out.println(slowRide.getColor() + " " + slowRide.getFuelCapacity());


        Car fastCar = new Car("white", 1, 12,400);
        fastCar.setColor("White");
        fastCar.setFuelCapacity(400);
        fastCar.setNumberOfPassengers(1);

        System.out.println(fastCar.getColor() + " " + fastCar.getFuelCapacity() + " " + fastCar.getNumberOfPassengers());



        SemiTruck slowMovement = new SemiTruck();

        slowMovement.setColor("grey");
        slowMovement.setFuelCapacity(182);
        slowMovement.setNumberOfPassengers(2);

        System.out.println(slowMovement.getColor() + " " + slowMovement.getFuelCapacity() + " " + slowMovement.getNumberOfPassengers());




        Hovercraft hovercraft = new Hovercraft();

        hovercraft.setColor("watercolor");
        hovercraft.setFuelCapacity(100);
        hovercraft.setNumberOfPassengers(4);


        System.out.println(hovercraft.getColor() + " " + hovercraft.getFuelCapacity() + " " + hovercraft.getNumberOfPassengers());





    }

}