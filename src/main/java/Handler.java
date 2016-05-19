import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by veronicacrowe on 5/18/16.
 */
public class Handler {
    public int numberOfPets;
    public TypeOfPet typeOfPet;
    ArrayList<Pet> arrayTypeOfPet = new ArrayList<Pet>();

    public int numberOfPets(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        numberOfPets = sc.nextInt();
        return numberOfPets;
    }

    public String kindPets() {
        for (int i = 1; i <= numberOfPets; i++) {
            String name = nameOfPets();
            Scanner sc = new Scanner(System.in);
            System.out.println("What kind of pet is are/is your pet(s)?");
            String petType = sc.nextLine();
            switch (petType.toUpperCase()) {
                case "CAT":
                    arrayTypeOfPet.add(new Cat(name));
                    break;
                case "DOG":
                    arrayTypeOfPet.add(new Dog(name));
                    break;
                case "PANDA":
                    arrayTypeOfPet.add(new Panada(name));
                    break;
                default:
                    System.out.println("Sorry that is not a correct option.");
            }

        }
        return null;
    }

    public String nameOfPets() {
            Scanner sc = new Scanner(System.in);
            System.out.println("What are the names of your pet(s)?");
            String name = sc.nextLine();


        return name;
    }

    public void runProgram(){
        numberOfPets();
        kindPets();
        printName();
    }

    public void printName() {
        for (int i = 0; i < arrayTypeOfPet.size(); i++ ) {
            System.out.println(arrayTypeOfPet.get(i).getName() + " says " + arrayTypeOfPet.get(i).speak());
        }
    }

}
