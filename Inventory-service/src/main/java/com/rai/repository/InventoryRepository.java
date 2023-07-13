package com.rai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rai.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

	Optional<Inventory> findBySkuCode();

}
