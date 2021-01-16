package com.company.creatures;

import com.company.creatures.animal;
import com.company.devices.car;
import com.company.devices.phone;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class human {
    public String name;
    animal pet;
    public com.company.devices.car car;
    private Double salary = 2545.0;
    private Double inflacja=1.19;

    Double cash = 0.0;
    phone phone;


    public String toString() {
        return salary + " " + name;
    }
    public  void addMyCar(car car) {
        this.car = car;
    }
    public  car getCar(){
        return car;
    }
    public Double getSalary() {
        System.out.println( " Data " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME) +" Siano " + salary);
        return salary;
    }
    public Double setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("hajs musi byc na +");
        } else {
            System.out.println("wypisuje informacje o tym, że nowe dane zostały wysłane do systemu księgowego ");
            System.out.println("wypisuje informację o konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("wypisuje info, że ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu ");
            return this.salary = salary;
        }
        return this.salary = salary;
    }
    public void setNewCar(car car) {
        if (salary >= car.price) {
            System.out.println("auto zalatwione");
            getCar();
        } else if (salary > (car.price / 12)) {
            System.out.println("kredyt jedyna opcja");
            getCar();
        } else {
            System.out.println("nie stac cie ");
        }
    }
    public double getCash() {
        return cash + salary;
    }

    public void setCash(double cash) {
        this.cash = this.cash + cash;
    }
    public animal getPet() {
        return pet;
    }
    public void setPet(animal pet) {
        this.pet = pet;
    }
    public phone getPhone() {
        return phone;
    }
    public void setPhone(phone phone) {
        this.phone = phone;
    }}