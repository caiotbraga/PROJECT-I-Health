package Person;

public class Patient extends Person{
    
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

    @Override
    public String personInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person Information:");
        sb.append(System.getProperty("line.separator"));
        sb.append("NAME: "+fullName);
        return sb.toString();
    }
    
}
