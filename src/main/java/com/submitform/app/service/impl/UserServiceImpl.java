package com.submitform.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.submitform.app.dao.UserDao;
import com.submitform.app.dto.Persons;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserDao userDao;
	
	public Persons findPersonById(int personId){
		
		return userDao.findPerson(personId);
	}
}
