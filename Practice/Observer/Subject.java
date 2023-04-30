package com.Practice.Observer;

public interface Subject {
    void addUser(Observer observer);
    void removeUser(Observer observer);
    void notifyObservers();
}
