package com.CreationalDesignPattern.AbstractFactory;

public class LaptopFactory extends AbstractDeviceFactory {
    public Device getDevice(DeviceType deviceType) {
        switch (deviceType) {
            case Hp:
                return new Hp("8gb", "Intel", "NVIDIA RTX 4090");
            case Lenovo:
                return new Lenovo("16gb", "Intel","NVIDIA RTX 3090");
        }
        return null;
    }
}