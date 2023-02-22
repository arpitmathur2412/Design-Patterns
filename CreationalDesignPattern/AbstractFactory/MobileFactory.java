package com.CreationalDesignPattern.AbstractFactory;

public class MobileFactory extends AbstractDeviceFactory{
    public Device getDevice(DeviceType Dtype) {
        switch (Dtype) {
            case Oneplus:
                return new Oneplus("8gb", "Mediatek");
            case Apple:
                return new Apple("6gb","A15");
        }
        return null;
    }
}
