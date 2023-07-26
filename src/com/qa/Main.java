package com.qa;
import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class Main {
    public static void main(String[] args){
           Cat c = new Cat("Whiskers", 10);
           Cat c2 = new Cat("Midas", 8);
           Dog d = new Dog("Spot", 2);
           Rabbit r = new Rabbit("Peter", 2);
           Rabbit r2 = new Rabbit("Cottontail", 3);

        ArrayList<Animal> AnimalList = new ArrayList<Animal>();
        AnimalList.add(c);
        AnimalList.add(c2);
        AnimalList.add(d);
        AnimalList.add(r);
        AnimalList.add(r2);

        for (Animal animal : AnimalList) {
            System.out.println(animal);
        }

        HashMap<String, Animal> animalMap = new HashMap<String,Animal>();
                   animalMap.put(c.getName(), c);
                   animalMap.put(c2.getName(), c2);
                   animalMap.put(d.getName(), d);
                   animalMap.put(r.getName(), r);
                   animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();

        animalMap2.put(c, "Fluffy");
        animalMap2.put(c2, "Doesn't like being picked up");
        animalMap2.put(d, "Overly excited about running");
        animalMap2.put(r, "Snuffles a lot, may have a cold");
        animalMap2.put(r2, "May actually be evil. Unsure.");

        System.out.println(
                "\nFor each loop on the animal map values ");
        for (String key : animalMap.keySet()) {
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }

        HashSet<Animal> set = new HashSet<>();
                   set.addAll(AnimalList);
                   set.add(c);
                   set.add(c2)

    }
}
