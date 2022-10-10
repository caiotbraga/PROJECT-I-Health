package Person;

public class Professional extends Person{
    
    protected String certificate;
    protected Specialization specialization;

    public Professional(String cpf, String rg, String fullName, String address, String birthdate, String certificate, Specialization specialization) {
        super(cpf, fullName, address);
        this.certificate = certificate;
        this.specialization = specialization;
    }


    
}
