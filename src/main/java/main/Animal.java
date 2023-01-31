package main;

public class Animal {
    String species;
    String name;
    int age;

    // Constructor
    Animal(){
        this.species = "";
        this.name = "";
        this.age = 0;
    }

    // Constructor
    Animal(String species, String name, int age){
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void run(int amount){
        for (int i = 0; i < amount; i++){
            System.out.println(name + " juoksee kovaa vauhtia!");          
        }
    }

    public String toString(){
        // Siili: Pikseli, 5 vuotta
        String s = "" + this.species +
        ": " + this.name +
        ", "+ this.age + " vuotta\n";
        return s;
    }
}
