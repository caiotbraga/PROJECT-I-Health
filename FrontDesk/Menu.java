package FrontDesk;
import java.util.Scanner;

public class Menu {
public static void main(String[] args) {
int op;
Scanner scan= new Scanner (System.in);    
    
        do{
        showMenu();
        op= scan.nextInt(); scan.nextLine();
        
        switch (op) {
            case 1:
            
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