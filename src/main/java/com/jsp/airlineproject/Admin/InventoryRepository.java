package com.jsp.airlineproject.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.airlineproject.Entity.Inventory;
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer>
{

}
