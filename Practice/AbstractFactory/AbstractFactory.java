package com.Practice.AbstractFactory;

abstract class AbstractFactory {

    abstract Car getCar(String cartype);
    abstract Bike getBike(String biketype);

}
