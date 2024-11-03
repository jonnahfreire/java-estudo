package br.com.study.domain.repositories;

import br.com.study.domain.entities.Person;
import br.com.study.domain.shared.IRepository;
import br.com.study.domain.shared.utils.FindWhereCallback;

public abstract class IPersonRepository extends IRepository<Person> {
    public abstract Person getById(int id);
    public abstract Person findWhere(FindWhereCallback<Person> callback);
}