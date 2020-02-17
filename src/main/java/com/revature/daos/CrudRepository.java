package com.revature.daos;

import java.util.Set;

public interface CrudRepository<T> {
	public T save(T t);
	
	public Set<T> findAll();
	
	public T findById(int id);
	
	public boolean update(T t);
	
	public boolean deleteById(T t);
}
