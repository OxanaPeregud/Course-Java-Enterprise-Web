package com.peregud.studentdao.dao;

import java.util.List;

public interface DAO<T> {
    List<T> getAll();
    T add(T t);
    void delete(int id);
    T getById(int id);
}
