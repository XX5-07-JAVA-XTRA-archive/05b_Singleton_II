package com.cc.java;

public class Dog extends Pet{

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String petSounds() {
        return name + " says: Bark!";
    }

    
}