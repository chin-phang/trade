package com.aaron.kafka.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aaron.kafka.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
