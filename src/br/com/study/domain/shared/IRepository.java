package br.com.study.domain.shared;

import java.util.List;

public abstract class IRepository<T> {
    public abstract List<T> getAll();
}
