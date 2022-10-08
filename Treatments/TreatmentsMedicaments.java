package Treatments;
import Financial.Values;

public class TreatmentsMedicaments extends Values{
protected String type;
protected String name;
protected double dose;
protected int period;
double code;

//construtor
    public TreatmentsMedicaments(String type, String name, double dose, int period) {
    this.type = type;
    this.name = name;
    this.dose = dose;
    this.period = period;
    }
//metodo
    public void prescription(TreatmentsMedicaments object){
        if(object.type== "drug" && object.name== "dipirona"){
            code= 20;
        }
        if(object.type== "therapy" && object.name== "quiroplaxia"){
            code= 50;
        }
        System.out.println("not found :(");
    }
}
