package com.vetclinic.managment;

public class Owner {

    // 1. PRIVATE FIELDS (minimum 4)
    private int ownerId;
    private String name;
    private String phone;
    private int numberOfPets;

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Owner(int ownerId, String name, String phone, int numberOfPets) {
        this.ownerId = ownerId;
        this.name = name;
        this.phone = phone;
        this.numberOfPets = numberOfPets;
    }

    // 3. DEFAULT CONSTRUCTOR
    public Owner() {
        this.ownerId = 0;
        this.name = "Unknown";
        this.phone = "Unknown";
        this.numberOfPets = 0;
    }

    // 4. GETTERS
    public int getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    // 5. SETTERS
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    // 6. ADDITIONAL METHODS (LOGIC)
    public void addPet() {
        numberOfPets++;
    }

    public boolean isFrequentClient() {
        return numberOfPets >= 3;
    }

    // 7. toString METHOD
    @Override
    public String toString() {
        return "Owner{" +
                "ownerId=" + ownerId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", numberOfPets=" + numberOfPets +
                '}';
    }
}