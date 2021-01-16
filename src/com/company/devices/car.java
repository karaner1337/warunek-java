package com.company.devices;

import com.company.Salleable;
import com.company.creatures.human;

public abstract class car extends device {
    public String colour;
    public Double price;
    public String model;
    public String producer;
    public String typee;

    public abstract String refuel();

    public String toString() {
        return producer + " " + model + " " + colour + " " + price + " " + typee;
    }
    @Override

    public boolean turnOn() {
        System.out.println("ON");
        return true;
    }

    public Salleable salleable = new Salleable() {
        @Override

        public void sell(human seller, human buyer, Double price) {
            if(buyer.getCash()>=price) {
                if (seller.getPet() == null) {
                    System.out.println("zwierze not found");
                } else {
                    System.out.println("zwierze found");
                    buyer.setCash(-price);
                    buyer.setPet(seller.getPet());
                    seller.setCash(+price);
                }

                if (seller.getCar() == null) {
                    System.out.println("auto not found");
                } else {
                    System.out.println("auto found");
                }

                if (seller.getPhone() == null) {
                    System.out.println("smartpgone not found");
                } else {
                    System.out.println("smartphone found");
                }
            }else {
                System.out.println("piniadze not found");
            }


        }

    };



}