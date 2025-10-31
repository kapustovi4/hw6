package com.sibsutis.devices;

import java.util.Objects;

public class PersonalComputer extends Device {
    public PersonalComputer(int id, int price) {
        super(id, price, null);
    }

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    public String getDeviceType() {
        return "PersonalComputer";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonalComputer)) return false;
        Device device = (Device) o;
        return getId() == device.getId() && 
               getPrice() == device.getPrice() && 
               Objects.equals(getIp(), device.getIp());
    }

    public int hashCode() {
        return Objects.hash(getId(), getPrice(), getIp());
    }
}    


