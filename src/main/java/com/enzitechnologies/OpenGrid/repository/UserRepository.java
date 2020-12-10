package com.enzitechnologies.OpenGrid.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.enzitechnologies.OpenGrid.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	User findByEmail(String email);
	
}
