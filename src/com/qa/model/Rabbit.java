package com.qa.model;

public class Rabbit extends Animal {
    public Rabbit(String name, int age ){

        super(name, age);
    }

    @Override
    public String greeting() {

        return "Snuffle Snuffle"+ getName();
    }
    @Override
    public String move() {

        return "Hop Hop Hop";
    }
    @Override
    public String toString() {

        return "Rabbit" + super.toString();
    }
}
