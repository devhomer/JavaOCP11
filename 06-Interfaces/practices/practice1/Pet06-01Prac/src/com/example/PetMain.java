package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        System.out.println("------Spider like spider------");
        Spider s = new Spider();
        s.walk();
        s.eat();
        if (s instanceof Pet){
            playWithAnimal((Animal)s);
        }else{
            System.out.println("Danger!. Wild Animal");
        }

        //test a spider with an animal reference
        a = new Spider();
        System.out.println("------Spider like animal------");
        a.eat();
        a.walk();
        if (a instanceof Pet){
            playWithAnimal((Animal)a);
        }else{
            System.out.println("Danger!. Wild Animal");
        }

        //test a fish with a pet reference
        Pet fish = new Fish();
        System.out.println("------Fish like pet------");
        fish.setName("Nemo");
        System.out.println(fish.getName());
        if (fish instanceof Pet){
            ((Animal)fish).walk();
            ((Animal)fish).eat();
            playWithAnimal((Animal)fish);
        }else{
            System.out.println("Danger!. Wild Animal");
        }

        //test a cat with a pet reference
        Pet cat = new Cat("Garfield",4);
        System.out.println("------Cat like pet------");
        cat.play();
        cat.getName();

        if (cat instanceof Pet){
            ((Animal)cat).walk();
            ((Animal)cat).eat();
            playWithAnimal((Animal)cat);
        }else{
            System.out.println("Danger!. Wild Animal");
        }

    }

    public static void playWithAnimal(Animal a) {
        Pet pet = (Pet) a;
        pet.play();
    }

}