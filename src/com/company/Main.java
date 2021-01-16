package com.company;

import com.company.devices.car;
import com.company.devices.phone;
import com.company.creatures.animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Feedable;
import com.company.cars.Electric;
import com.company.cars.LPG;
import com.company.cars.Diesel;
import com.company.creatures.human;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        animal animal = new animal() {

            @Override

            public void feed(Double foodWeight) { }};


        animal.feed();
        animal.takeForAWalk();
        /**    animal.takeForAWalk();
         animal.takeForAWalk();
         animal.feed();
         animal.feed();
         animal.feed(); */
        human human = new human();


        car bmw  = new LPG();
        bmw.model = "m2";
        bmw.producer = "Bmw zdunek";
        bmw.colour ="space grey";
        bmw.price = 2000.0;
        bmw.typee = "suv";



        car audi  = new Diesel();
        audi.model = "q8";
        audi.producer = "Audi corp";
        audi.colour ="black";
        audi.price = 3045.0;
        audi.typee = "sedan";



        car tesla  = new Electric();
        tesla.model = "x2 ";
        tesla.producer = "tesla";
        tesla.colour ="white";
        tesla.price = 405.5;
        tesla.typee = "sport";



        human.addMyCar(bmw);
        human.setNewCar(bmw);

        phone phone = new phone();
        phone.setModel("hujawei");
        System.out.println(human.toString());
        System.out.println(bmw.toString());
        System.out.println(animal.toString());
        human buyer = new human();
        buyer.setSalary(0.0);
        buyer.setCash(500);
        human seller = new human();
        seller.setPhone(phone);
        seller.setPet(animal);
        seller.addMyCar(bmw);
        seller.setSalary(10000.0);
        animal.salleable.sell(seller, buyer, 3000.0);
        bmw.salleable.sell(seller, buyer, 2000.0);
        phone.salleable.sell(seller, buyer, 7000.0);
        System.out.println("fundusze sprzedawcy przed " + seller.getCash());
        System.out.println("fundusze nabywcy przed  " + buyer.getCash());
        System.out.println( " Data " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));

    }

}