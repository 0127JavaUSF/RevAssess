package com.tier4.interfaces;

import java.util.Set;

public interface CrudRepository<T> {
	
	T save (T t);
	Set<T> findAll();
	T findById(Integer id);
	boolean update(T t);
	boolean deleteById(Integer id);

}
