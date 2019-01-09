package com.company.lambdy_animals_funcionalIF;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // list of the animals:

        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Animal("Oskar", true, true, true));
        animalList.add(new Animal("Kangur", true, false, true));
        animalList.add(new Animal("Papuga", false, true, true));
        animalList.add(new Animal("Pies", false, false, false));

        // By creating objects and with using additional interfaces that implements AnimalChecker:
        //AnimalChecker checkJump = new CheckJump();
        //AnimalChecker checkRun = new CheckRun();
        //AnimalChecker checkSpeak = new CheckSpeak();

        //checker(animalList,checkJump);
        //checker(animalList,checkRun);
        //checker(animalList,checkSpeak);

        // WITH LAMBDA:
        // Here we dont need intefaces CheckJump, CheckRun i CheckSpeak

        System.out.println("Can Jump:");
        checker(animalList,s-> s.isCanJump());
        System.out.println("Can Run:");
        checker(animalList,s-> s.isCanRun());
        System.out.println("Can Speak:");
        checker(animalList,s-> s.isCanSpeak());


    }
        private static void checker (List<Animal> animals, AnimalChecker animalChecker){
        for (Animal animal: animals){
            System.out.println(animal.getName() + " : " + animalChecker.checkSkill(animal));
        }
    }
}
