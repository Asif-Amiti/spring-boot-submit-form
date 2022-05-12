package com.submitform.app.dao;

import java.util.List;

import com.submitform.app.dto.Persons;

public interface UserDao {
	<T> T  findById(Class<T> clazz, Long id);
	public List<Persons> findPersonById(int id);
	public Persons findPerson(int personId);
}
