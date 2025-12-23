package com.vetclinic.managment;

public class Veterinarian {

    // 1. PRIVATE FIELDS (minimum 4)
    private int vetId;
    private String name;
    private String specialization;
    private int experience; // years

    // 2. CONSTRUCTOR WITH PARAMETERS
    public Veterinarian(int vetId, String name, String specialization, int experience) {
        this.vetId = vetId;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    // 3. DEFAULT CONSTRUCTOR
    public Veterinarian() {
        this.vetId = 0;
        this.name = "Unknown";
        this.specialization = "General";
        this.experience = 0;
    }

    // 4. GETTERS
    public int getVetId() {
        return vetId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }

    // 5. SETTERS
    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    // 6. ADDITIONAL METHODS (LOGIC)
    public boolean isExperienced() {
        return experience >= 5;
    }

    public boolean canTreat(String animalType) {
        return specialization.equalsIgnoreCase(animalType);
    }

    // 7. toString METHOD
    @Override
    public String toString() {
        return "Veterinarian{" +
                "vetId=" + vetId +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", experience=" + experience +
                '}';
    }
}