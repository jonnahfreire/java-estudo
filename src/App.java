import br.com.study.application.usecases.GetPersonUsecase;
import br.com.study.domain.entities.Person;
import br.com.study.domain.repositories.IPersonRepository;
import br.com.study.infra.repositories.PersonRepository;

public class App {
    public static void main(String[] args) throws Exception {
        IPersonRepository personRepository = new PersonRepository();
        GetPersonUsecase getPersonUsecase = new GetPersonUsecase(personRepository);

        final int id = 2;
        Person person = getPersonUsecase.execute(id);
        if(person != null) {
            System.err.println(person.toString());        
        }else {
            System.err.println("Pessoa com id " + id + ", não encotnrada.");        
        }
    }
}
