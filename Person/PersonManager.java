package Person;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {
    
    private List<Person> personList;

    public PersonManager(){
        this.personList = new ArrayList<>();
    }

    public void add(Person user) {
        if(existPerson(user.getCpf()) == true){
            //exceção pra ser adc
            
        }
        else{
            personList.add(user);
        }
    }

    public void remove(Person person){
        if(existPerson(person.getCpf()) == true){
            personList.remove(person);
        }
        else{
           //lançar a exceção
        }
    }

    public boolean existPerson(String cpf){
        for (Person person : personList) {
            if(person.getCpf().compareTo(cpf) == 0)
                return true;
        }
        return false;
    }
}
