package com.jsp.airlineproject.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.airlineproject.Entity.AirLineInformation;
@Repository
public interface AirLineRepository extends JpaRepository<AirLineInformation, Integer>
{

}
