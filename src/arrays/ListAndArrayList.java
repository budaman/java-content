package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListAndArrayList {
    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];
    private static GroceryList groceryList = new GroceryList();

    public static void main(String args[]) {
//        simpleArrayExmpl();
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item.");
        System.out.println("\t 4 - To remove an item.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item");
        s.nextLine();
        String newItem =s.nextLine();
        groceryList.addGroceryItem(newItem);
    }

    public static void modifyItem() {
        System.out.println("Enter item to modify: ");
        String item = s.nextLine();
        s.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        String itemToDelete = s.nextLine();
        s.nextLine();
        groceryList.removeGroceryItem(itemToDelete);
    }

    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        s.nextLine();
        String searchItem = s.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Item not found");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void simpleArrayExmpl() {
        System.out.println("Enter 10 integers");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers");
        getInput();
        printArray(baseData);
    }
    public static void getInput () {
        for (int i=0; i<baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }
    public static void printArray(int[] baseData){
        for(int i=0; i<baseData.length; i++) {
            System.out.println(baseData[i]);
        }
    }
    public static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for(int i=0; i<original.length; i++) {
            baseData[i] = original[i];
        }
    }
}

