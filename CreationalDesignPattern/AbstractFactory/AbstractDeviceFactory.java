package com.CreationalDesignPattern.AbstractFactory;

public abstract class AbstractDeviceFactory {
    public abstract Device getDevice(DeviceType deviceType);
}