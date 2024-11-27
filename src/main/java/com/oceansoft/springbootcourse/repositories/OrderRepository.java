package com.oceansoft.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oceansoft.springbootcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}