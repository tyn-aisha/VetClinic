package com.vetclinic.managment;

public class Main {

    public static void main(String[] args) {

        // 1. Welcome message
        System.out.println("=== Vet Clinic Management System ===");
        System.out.println("Our system helps manage pets, owners, and veterinarians\n");

        // 2. Create objects
        Pet pet1 = new Pet(1, "Buddy", "Dog", 2, "Aisha");
        Pet pet2 = new Pet();

        Owner owner1 = new Owner(101, "Aisha", "+77011234567", 2);
        Owner owner2 = new Owner();

        Veterinarian vet1 = new Veterinarian(201, "Dr. Smith", "Dog", 6);
        Veterinarian vet2 = new Veterinarian();

        // 3. Display objects
        System.out.println("--- PETS ---");
        System.out.println(pet1);
        System.out.println(pet2);

        System.out.println("\n--- OWNERS ---");
        System.out.println(owner1);
        System.out.println(owner2);

        System.out.println("\n--- VETERINARIANS ---");
        System.out.println(vet1);
        System.out.println(vet2);

        // 4. Test getters
        System.out.println("\n--- GETTERS ---");
        System.out.println("Pet name: " + pet1.getName());
        System.out.println("Owner phone: " + owner1.getPhone());
        System.out.println("Vet experience: " + vet1.getExperience());

        // 5. Test setters
        pet2.setName("Kitty");
        pet2.setSpecies("Cat");
        pet2.setAge(1);
        pet2.setOwnerName("Bob");

        owner2.setName("Bob");
        owner2.setPhone("+77012345678");
        owner2.setNumberOfPets(1);

        vet2.setName("Dr. Brown");
        vet2.setSpecialization("Cat");
        vet2.setExperience(3);

        // 6. Test logic methods
        System.out.println("\n--- LOGIC METHODS ---");
        System.out.println("Is pet young? " + pet1.isYoung());
        System.out.println("Pet life stage: " + pet1.getLifeStage());
        System.out.println("Is frequent client: " + owner1.isFrequentClient());
        System.out.println("Is vet experienced: " + vet1.isExperienced());
        System.out.println("Can vet treat dogs? " + vet1.canTreat("Dog"));

        // 7. Final state
        System.out.println("\n--- FINAL STATE ---");
        System.out.println(pet2);
        System.out.println(owner2);
        System.out.println(vet2);

        // 8. Completion message
        System.out.println("\n=== Program Complete ===");
        System.out.println("\n--- EXTRA GETTERS TEST ---");
        System.out.println("Pet ID: " + pet1.getPetId());
        System.out.println("Species: " + pet1.getSpecies());
        System.out.println("Age: " + pet1.getAge());
        System.out.println("Owner name: " + pet1.getOwnerName());

        pet1.setPetId(10);
        System.out.println("Updated Pet ID: " + pet1.getPetId());
    }
}