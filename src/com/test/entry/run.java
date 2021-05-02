package com.test.entry;

public class run {
    public static void main(String[] args) {
        useAnimal(new Cat());
        useAnimal(new Dog());
    }

    public static void useAnimal(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.play();
        }

        if(animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.play();
        }

    }
}
