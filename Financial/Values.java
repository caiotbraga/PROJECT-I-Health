package Financial;

public class Values {
protected double custs;    
Bank collector= new Bank();
    
    public double calculateValuesOfTreatments(double code){
    if(code== 1){
        custs=20;
        collector.revenueCollection(custs);
        return custs;
    }
    if(code== 2){
        custs=50;
        collector.revenueCollection(custs);
        return custs;
    }
    return 0;
    }
}
