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
                    System.out.println("Informe seu CPF");
                    String cpf = scan.nextLine();
                    System.out.println("Informe seu RG");
                    String rg = scan.nextLine();
                    System.out.println("Informe sua data de nascimento");
                    String birthdate = scan.nextLine();
                    System.out.println("Informe seu nome inteiro");
                    String nome = scan.nextLine();
                    System.out.println("Informe seu endereço");
                    String endereco = scan.nextLine();
                    System.out.println("Informe seu tipo sanguineo");
                    String sangue = scan.nextLine();
                    System.out.println("Informe sua altura");
                    String altura = scan.nextLine();
                    System.out.println("Informe seu peso");
                    String peso = scan.nextLine();
                    System.out.println("Caso tenha algum tipo de alergia informe, caso não tenha, digite N/A");
                    String alergia = scan.nextLine();
                    System.out.println("Informe seu plano de sáude, caso não tenha, digite N/P");
                    String plano = scan.nextLine();


                break;
            case 2:
                     System.out.println("Informe seu CPF");
                    String cpfFuncionario = scan.nextLine();
                    System.out.println("Informe seu RG");
                    String rgFuncionario = scan.nextLine();
                    System.out.println("Informe sua data de nascimento");
                    String birthdateFuncionario = scan.nextLine();
                    System.out.println("Informe seu nome inteiro");
                    String nomeFuncionario = scan.nextLine();
                    System.out.println("Informe seu endereço");
                    String enderecoFuncionario = scan.nextLine();
                    System.out.println("Informe o número de seu certificado");
                    String certificado = scan.nextLine();
                    System.out.println("Informe a sua especialidade");
                    String specialist = scan.nextLine();


                break;
            case 3:
            System.out.println("Escolha");
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