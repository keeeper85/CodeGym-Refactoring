package com.codegym.task.task29.task2909.car;

import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers){
        switch (type){
            case 0:
                return new Truck(numberOfPassengers);
            case 1:
                return new Sedan(numberOfPassengers);
            case 2:
                return new Cabriolet(numberOfPassengers);
        }
        return null;
    }

    public void fill(double numberOfGallons) throws Exception {
        if (numberOfGallons < 0)
            throw new Exception();
        fuel += numberOfGallons;

    }

    public boolean isSummer(Date date, Date summerStart, Date summerEnd){
        if ((date.after(summerStart)) && date.before(summerEnd)) return true;
        return false;
    }

    public double getWinterConsumption(int length){
        double consumption = length * winterFuelConsumption + winterWarmingUp;
        return consumption;
    }

    public double getSummerConsumption(int length){
        double consumption = length * summerFuelConsumption;
        return consumption;
    }

    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {

        if (isSummer(date, summerStart, summerEnd)) {
            return getSummerConsumption(length);
        }
        return getWinterConsumption(length);
    }

    public int getNumberOfPassengersThatCanBeCarried() {
        if (canPassengersBeCarried())
            return numberOfPassengers;


        return 0;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    private boolean canPassengersBeCarried(){
        if (isDriverAvailable() && fuel > 0) return true;
        return false;
    }

    public void startMoving() {

        fastenDriverBelt();

        if (numberOfPassengers > 0) {
            fastenPassengerBelts();
        }
    }

    public void fastenPassengerBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();

}