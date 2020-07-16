package com.webapp.Jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.webapp.Jpa.Model.Person;

public interface PersonRepo extends CrudRepository<Person, Integer> {

}
