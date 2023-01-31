package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int Menu(Scanner Scan){
        System.out.println(
        "1) Luo uusi eläin, "+
        "2) Listaa kaikki eläimet, "+
        "3) Juoksuta eläimiä, "+
        "0) Lopeta ohjelma");
        int selection = Integer.valueOf(Scan.nextLine());
        return selection;
    }
    public static int addNewAnimal(Scanner Scan, Zoo newZoo){
        System.out.println("Mikä laji?");
        String species = Scan.nextLine();
        System.out.println("Anna eläimen nimi:");
        String name = Scan.nextLine();
        System.out.println("Anna eläimen ikä:");
        int age = Integer.valueOf(Scan.nextLine());
        Animal animal = new Animal(species,name,age);
        newZoo.addAnimal(animal);

        return 0;
    }

    public static void printZoo(Zoo newZoo){
        System.out.print(newZoo.toString());
    }

    public static void runningAnimal(Scanner Scan, Zoo newZoo){
        System.out.println("Kuinka monta kierrosta?");
        int amount = Integer.valueOf(Scan.nextLine());
        newZoo.gymTime(amount);
    }

    public static void main( String[] args )
    {
        Zoo newZoo = new Zoo();
        Scanner Scan = new Scanner(System.in);
        int selection;

        System.out.println( "Anna eläintarhalle nimi:" );
        String name = Scan.nextLine();
        newZoo.setName(name);
        do {
            selection = Menu(Scan);
            switch(selection){
                case 0:
                    Scan.close();
                    System.out.println("Kiitos ohjelman käytöstä.");
                break;
                case 1:
                    addNewAnimal(Scan, newZoo);
                break;
                case 2:
                    printZoo(newZoo);
                break;
                case 3:
                    runningAnimal(Scan,newZoo);
                break;
                default:

                break;
            }
        } while (selection != 0);
    }
}
