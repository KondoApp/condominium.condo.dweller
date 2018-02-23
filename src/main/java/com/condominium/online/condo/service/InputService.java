package com.condominium.online.condo.service;

public interface InputService<T, R> {
    boolean insert(T t);
    boolean update(T t);
    boolean delete(R r);
}
