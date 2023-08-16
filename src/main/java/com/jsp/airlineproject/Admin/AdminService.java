package com.jsp.airlineproject.Admin;

import com.jsp.airlineproject.DTO.AirLineInformationDTO;
import com.jsp.airlineproject.DTO.FareDTO;
import com.jsp.airlineproject.DTO.FlightDTO;
import com.jsp.airlineproject.DTO.FlightInformationDTO;
import com.jsp.airlineproject.DTO.InventoryDTO;

public interface AdminService 
{
	int addAirLine(AirLineInformationDTO dto);
	int addFlightInfo(FlightInformationDTO dto);
	int addFareDetails(FareDTO dto);
	int addInventory(InventoryDTO dto);
	int addFlight(FlightDTO dto);
}
