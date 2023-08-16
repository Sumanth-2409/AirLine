package com.jsp.airlineproject.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.airlineproject.Entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight , Integer>
{
	

}
