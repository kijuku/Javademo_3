package main;

import java.util.ArrayList;

public class Zoo {
    String name;
    ArrayList<Animal> zooAnimals; 
    
    // Constructor
    Zoo(){
        this.name = "";
        this.zooAnimals = new ArrayList<>();
    }

    // Constructor
    Zoo(String name){
        this.name = name;
        this.zooAnimals = new ArrayList<>();
    }

    // Constructor
    Zoo(String name, Animal animal){
        this.name = name;
        this.zooAnimals = new ArrayList<>();
        this.zooAnimals.add(animal);
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getZooAnimals() {
        return this.zooAnimals;
    }

    public void setZooAnimals(ArrayList<Animal> zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    public void addAnimal(Animal animal){
        this.zooAnimals.add(animal);
    }

    public void gymTime(int amount){
        for (Animal animal : zooAnimals){
            animal.run(amount);
        }
    }
    public String toString(){
        String s = "" + this.name + 
        " pitää sisällään seuraavat eläimet:\n";
        for (Animal animal : zooAnimals) {
            s += animal.toString();
        }
        return s;
    }
}