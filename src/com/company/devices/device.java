package com.company.devices;

public abstract class  device {
    public String producer;
    public String model;
    public String yearOfProduction;


    public String toString(){

        return producer+" "+model+" "+yearOfProduction;
    }
    public abstract boolean turnOn();
}