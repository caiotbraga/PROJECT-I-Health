package com.Health.build.Person;

public class Patient extends PersonInfo{

    private String bloodType;
    private String allergy;
    private String symptoms;
    private String healthPlan;
    private String weight;
    private String height;

    public Patient(String cpf, String rg, String fullName, String address, String birthdate, String bloodType, String allergy, String symptoms, String healthPlan, String weight, String height) {
        super(cpf, rg, fullName, address, birthdate);
        this.bloodType = bloodType;
        this.allergy = allergy;
        this.symptoms = symptoms;
        this.healthPlan = healthPlan;
        this.weight = weight;
        this.height = height;
    }

}
