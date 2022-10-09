package FrontDesk;
import java.util.Scanner;
import Person.Doctor;
import Person.Patient;

public class Menu {
public static void main(String[] args) {
int op;
Scanner scan = new Scanner(System.in);    
Doctor doc1= new Doctor(null, null, null, null, null, null, null);    
Patient pat1= new Patient("12345678900", "1207123", "caio", "aflitos", "19/02/03", "-O", "dipirona", "febre e moleza", "cassi", "72", "1,78");        

        do{
        showMenu();
        op= scan.nextInt(); scan.nextLine();
        
        switch (op) {
            case 1:
                    System.out.println(pat1.personInfo());
            break;
        
    
        }
        }
        while(op!= 0);
    }      
      
        public static void showMenu(){
        System.out.println("1- in dev");
        System.out.print("choice: ");
        }    

}