package com.example;

public class Cat
    extends Animal
    implements Pet{

    private String name;

    public Cat(String name, int legs){
        super(legs);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cats like to ear spiders and fish.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name+" likes to play with string");
    }
}
