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

    public String personInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------");
        sb.append(System.getProperty("line.separator"));
        sb.append("Person Information:");
        sb.append(System.getProperty("line.separator"));
        sb.append("NAME: "+fullName);
        sb.append(System.getProperty("line.separator"));
        sb.append("CPF: "+cpf);
        sb.append(System.getProperty("line.separator"));
        sb.append("RG: "+rg);
        sb.append(System.getProperty("line.separator"));
        sb.append("BIRTHDATE: "+birthdate);
        sb.append(System.getProperty("line.separator"));
        sb.append("ADDRESS: "+address);
        sb.append(System.getProperty("line.separator"));
        sb.append("HEALTH-PLAN: "+healthPlan);
        sb.append(System.getProperty("line.separator"));
        sb.append("BLOOD-TYPE: "+bloodType);
        sb.append(System.getProperty("line.separator"));
        sb.append("ALLERGY: "+allergy);
        sb.append(System.getProperty("line.separator"));
        sb.append("SYMPTOMS: "+symptoms);
        sb.append(System.getProperty("line.separator"));
        sb.append("HEIGHT: "+height);
        sb.append(System.getProperty("line.separator"));
        sb.append("WEIGHT: "+weight);
        sb.append(System.getProperty("line.separator"));
        sb.append("-------------------------------------------------");
        return sb.toString();
    }
    
}
