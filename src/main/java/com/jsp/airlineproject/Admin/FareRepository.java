package com.jsp.airlineproject.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.airlineproject.Entity.Fare;
@Repository
public interface FareRepository extends JpaRepository<Fare, Integer>
{

}
