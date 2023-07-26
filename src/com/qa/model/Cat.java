package com.qa.model;

public class Cat extends Animal {
    public Cat(String name, int age ){
      super(name, age);
    }

    @Override
    public String greeting() {
        return "Hello there "+ getName();
    }
    @Override
    public String move() {
        return "Alright, if you say so... ";
    }
    @Override
    public String toString() {
        return "Cat " + super.toString();
    }
}
