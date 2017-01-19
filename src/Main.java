/**
 * Created by Luke Bradley on 1/18/2017.
 */

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Store petStore = new Store();

        ArrayList<Pet> inventory = petStore.inventory;
        System.out.println("There are " + inventory.size() + " animals in the store right now.");

        petStore.buyPet();
        petStore.sellPet();
        petStore.printInventory();
    }
}
