package com.sibsutis.devices;

import java.util.Objects;

public class Phone extends Device {
    public Phone(int id, int price) {
        super(id, price, null);
    }

    public Phone(int id, int price, String ip) {
        super(id, price, ip);
    }


    public String getDeviceType() {
        return "Phone";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Device device = (Device) o;
        return getId() == device.getId() && 
               getPrice() == device.getPrice() && 
               Objects.equals(getIp(), device.getIp());
    }

    public int hashCode() {
        return Objects.hash(getId(), getPrice(), getIp());
    }
}



