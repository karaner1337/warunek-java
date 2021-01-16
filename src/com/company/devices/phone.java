package com.company.devices;

import com.company.Salleable;
import com.company.creatures.human;
import java.net.URL;
import java.util.List;
public class phone extends device  {

    public String model;
    public static final String appName = "Greatapp";
    public static final String version = "alfa";
    public static final String serverAddress = "456453";
    public List<String> appList;
    public URL url;

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
                    System.out.println("zwierzak not found");
                } else {
                    System.out.println("zwierzak found");
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
                System.out.println("piniadz not found");
            }


        }

    };
    public String getModel() {
        return model;
    }
    public String installAnnApp(String appName) {

        return appName;
    }

    public String installAnnApp(String appName, String version) {

        return appName + version;
    }

    public String installAnnApp(String appName, String version, String serverAddress) {

        return appName + version + serverAddress;
    }

    public String installAnnApp(List<String> appList) {

        return appList.toString();
    }

    public String installAnnApp(URL url) {

        return url.toString();
    }

    public void setModel(String model) {
        this.model = model;
    }
}