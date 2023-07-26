package com.qa.model;

public class Dog extends Animal {
    public Dog(String name, int age ){
        super(name, age);
    }

    @Override
    public String greeting() {
        return "Oh hey there "+ getName();
    }
    @Override
    public String move() {
        return "RUN! ";
    }
    @Override
    public String toString() {
        return "Dog " + super.toString();
    }
}