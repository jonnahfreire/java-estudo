package br.com.study.domain.shared.utils;

@FunctionalInterface
public interface FindWhereCallback<T> {
    Boolean test(T prop);
}