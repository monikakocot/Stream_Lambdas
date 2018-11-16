package com.company.lambdy_animals_funcionalIF.checker;

import com.company.lambdy_animals_funcionalIF.Animal;
import com.company.lambdy_animals_funcionalIF.AnimalChecker;

public class CheckSpeak implements AnimalChecker {

    @Override
    public boolean checkSkill(Animal animal) {
        return animal.isCanSpeak();
    }
}
