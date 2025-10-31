package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    private int id;
    private int price;
    private String ip;

    public Device(int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public int getId() { return id; }
    public int getPrice() { return price; }
    public String getIp() { return ip; }

    public String print() {
        return String.format("ID: %d, Price: %d, IP: %s, Type: %s", 
            id, price, ip, getDeviceType());
    }

    public abstract String getDeviceType();
}
