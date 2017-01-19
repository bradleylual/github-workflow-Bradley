/**
 * Created by Luke Bradley on 1/18/2017.
 */

import java.util.*;

public class Store {

    public ArrayList<Pet> inventory;

    public Store() {
        inventory = new ArrayList<Pet>();
        Pet dog = new Dog();
        Pet cat = new Cat();
        Pet bird = new Bird();
        inventory.add(0, dog);
        inventory.add(1, cat);
        inventory.add(2, bird);
        inventory.add(3, dog);
    }

    public void printInventory() {
        int dogSum = 0;
        int catSum = 0;
        int birdSum = 0;
        int petSum = 0;
        for (Pet p : inventory) {
            String pName = p.getName();
            if (pName == "Dog") {
                dogSum++;
                System.out.println("Dog");
            }
            else if (pName == "Cat") {
                catSum++;
                System.out.println("Cat");
            }
            else if (pName == "Bird") {
                birdSum++;
                System.out.println("Bird");
            }
        }
        petSum = dogSum + catSum + birdSum;
        System.out.println("We have " + petSum + " pets in the store right now. Of these, " + dogSum + " are dogs, "
            + catSum + " are cats, and " + birdSum + " are birds.");

    }

    public void buyPet() {
        Pet boughtPet = new Pet();
        Scanner reader = new Scanner(System.in);
        System.out.println("What kind of pet do you want to buy? Enter the species here (Dog, Cat, or Bird):");
        String boughtPetName = reader.next();
        boughtPetName = boughtPetName.toLowerCase();
        if (boughtPetName == "dog") {
            boughtPet = new Dog();
        }
        else if (boughtPetName == "cat") {
            boughtPet = new Cat();
        }
        else if (boughtPetName == "bird") {
            boughtPet = new Bird();
        }
        if (inventory.contains(boughtPet)) {
            inventory.remove(boughtPet);
            System.out.println("You have bought a new " + boughtPetName + "!");
        }
        else {
            System.out.println("Unfortunately, we have no " + boughtPetName + "s right now. Try again later!");
        }
    }

    public void sellPet() {
        Pet soldPet = new Pet();
        Scanner reader = new Scanner(System.in);
        System.out.println("What kind of pet do you want to sell? Enter the species here (Dog, Cat, or Bird):");
        String soldPetName = reader.next();
        soldPetName = soldPetName.toLowerCase();
        if (soldPetName == "dog") {
            soldPet = new Dog();
        }
        else if (soldPetName == "cat") {
            soldPet = new Cat();
        }
        else if (soldPetName == "bird") {
            soldPet = new Bird();
        }
        inventory.add(inventory.size(), soldPet);
        System.out.println("You have sold a " + soldPetName + ".");
    }
}

