package com.oceansoft.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceansoft.springbootcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}