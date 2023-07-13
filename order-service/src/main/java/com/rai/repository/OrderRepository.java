package com.rai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
