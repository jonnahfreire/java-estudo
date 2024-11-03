package br.com.study.application.usecases;

import br.com.study.domain.entities.Person;
import br.com.study.domain.repositories.IPersonRepository;
import br.com.study.domain.shared.IUsecase;

public class GetPersonUsecase implements IUsecase<Integer, Person> {
    IPersonRepository repository;
    
    public GetPersonUsecase(IPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person execute(Integer id) {
        return this.repository.findWhere((person) -> person.getId() == id);
        // return this.repository.getById(id);
    }
}
