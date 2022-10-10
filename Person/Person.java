package Person;
public abstract class Person {
    protected String cpf;
    protected String rg;
    protected String fullName;
    protected String address;
    protected String birthdate;
    
    public Person(String cpf, String rg, String fullName, String address, String birthdate) {
        this.cpf = cpf;
        this.rg = rg;
        this.fullName = fullName;
        this.address = address;
        this.birthdate = birthdate;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

    

}
