package br.com.study.infra.repositories;

import br.com.study.domain.entities.Person;
import br.com.study.domain.repositories.IPersonRepository;
import br.com.study.domain.shared.utils.FindWhereCallback;
import java.util.ArrayList;
import java.util.List;

public class PersonRepository extends IPersonRepository {
    ArrayList<Person> people = new ArrayList<>();
    
    public PersonRepository() {
        this.people.add(new Person(1, "Joao", "Pereira", 20));
        this.people.add(new Person(2, "Jose", "Franciso", 25));
    }

    @Override
    public List<Person> getAll() {
        return people;
    }

    @Override
    public Person getById(int id) {
        Person personFound = null;

        for (Person person : people) {
            if(person.getId() == id) {
                personFound = person; 
            }
        }
        return personFound;        
    }

    @Override
    public Person findWhere(FindWhereCallback<Person> callback) {
        for (Person person : people) {
            if(callback.test(person)) {
                return person;
            }
        }

        return null;
    }
}
