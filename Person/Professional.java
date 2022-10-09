package Person;

public class Professional extends Person{
    
    protected String certificate;
    protected String specialization;

    public Professional(String cpf, String rg, String fullName, String address, String birthdate, String certificate, String specialization) {
        super(cpf, rg, fullName, address, birthdate);
        this.certificate = certificate;
        this.specialization = specialization;
    }

    @Override
    public String personInfo() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
