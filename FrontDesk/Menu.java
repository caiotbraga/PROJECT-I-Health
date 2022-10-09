package FrontDesk;
import java.util.Scanner;
import Person.Doctor;
import Person.Patient;

public class Menu {
public static void main(String[] args) {
int op;
Scanner scan = new Scanner(System.in);        

        do{
        showMenu();
        op= scan.nextInt(); scan.nextLine();
        
        switch (op) {
            case 1:
                break;
            case 2:

                break;
            case 3:
            System.out.println("Escolha xxxxxx");
                break;
            case 4:
                break;
            case 5:
            System.out.println("Informe o CPF do cliente");
                break;
            case 6:
            System.out.println("Informe o CPF do funcionario");
                break;
            case 7:
            System.out.println("Informe o CPF do cliente");
                break;
            case 8:
            System.out.println("Informe o CPF do funcionario");
            case 0:
                System.out.println("Você fechou o programa!");
                break;
            default:
                System.out.println("Número inválido, insira uma opção na tela");
                break;
        
    
        }
        }
        while(op!= 0);
    }      
      
        public static void showMenu(){
        System.out.println("1 - Cadastrar um novo cliente \n" +
                "2 - Cadastrar um novo funcionario \n" +
                "3 - Marcar um atendimento \n" +
                "4 - Gerenciar um atendimento \n" +
                "5 - Alterar os dados de um cliente \n" +
                "6 - Alterar os dados de um funcionario \n" +
                "7 - Remover um cliente \n" +
                "8 - Remover um funcionario \n" +
                "0 - Sair do programa");
        System.out.print("choice: ");
        }    

}