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
}



