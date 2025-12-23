package com.vetclinic.managment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<Owner> owners = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // optional test data
        pets.add(new Pet(1, "Barsik", "Cat", 2, "Aisha"));
        owners.add(new Owner(101, "Aisha", "+77011234567", 1));

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addPet();
                case 2 -> viewAllPets();
                case 3 -> addOwner();
                case 4 -> viewAllOwners();
                case 0 -> {
                    System.out.println("Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice!");
            }

            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\n=== VET CLINIC SYSTEM ===");
        System.out.println("1. Add Pet");
        System.out.println("2. View All Pets");
        System.out.println("3. Add Owner");
        System.out.println("4. View All Owners");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    private static void addPet() {
        System.out.println("\n--- ADD PET ---");
        System.out.print("Pet ID: ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Species: ");
        String species = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt(); scanner.nextLine();

        System.out.print("Owner name: ");
        String ownerName = scanner.nextLine();

        Pet pet = new Pet(id, name, species, age, ownerName);
        pets.add(pet);

        System.out.println("Pet added!");
    }

    private static void viewAllPets() {
        System.out.println("\n--- ALL PETS ---");
        if (pets.isEmpty()) {
            System.out.println("No pets found.");
            return;
        }
        System.out.println("Total: " + pets.size());
        for (int i = 0; i < pets.size(); i++) {
            System.out.println((i + 1) + ". " + pets.get(i));
        }
    }

    private static void addOwner() {
        System.out.println("\n--- ADD OWNER ---");
        System.out.print("Owner ID: ");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Number of pets: ");
        int numberOfPets = scanner.nextInt(); scanner.nextLine();

        Owner owner = new Owner(id, name, phone, numberOfPets);
        owners.add(owner);

        System.out.println("Owner added!");
    }

    private static void viewAllOwners() {
        System.out.println("\n--- ALL OWNERS ---");
        if (owners.isEmpty()) {
            System.out.println("No owners found.");
            return;
        }
        System.out.println("Total: " + owners.size());
        for (int i = 0; i < owners.size(); i++) {
            System.out.println((i + 1) + ". " + owners.get(i));
        }
    }
}