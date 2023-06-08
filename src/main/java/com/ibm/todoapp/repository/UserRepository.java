package com.ibm.todoapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.todoapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User getUserByUserName(String userName);

	List<User> findByUserName(String userName);
}
