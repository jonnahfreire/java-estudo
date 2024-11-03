package br.com.study.domain.shared;

public interface IUsecase<Input, Output> {
    Output execute(Input data);
}