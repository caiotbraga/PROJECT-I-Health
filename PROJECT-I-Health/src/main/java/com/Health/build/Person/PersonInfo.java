package com.Health.build.Person;
abstract public class PersonInfo {
    protected String cpf;
    protected String rg;
    protected String fullName;
    protected String address;
    protected String birthdate;

    public PersonInfo(String cpf, String rg, String fullName, String address, String birthdate) {
        this.cpf = cpf;
        this.rg = rg;
        this.fullName = fullName;
        this.address = address;
        this.birthdate = birthdate;
    }

}
