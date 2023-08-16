package com.jsp.airlineproject.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airlineproject.DTO.AirLineInformationDTO;
import com.jsp.airlineproject.DTO.FareDTO;
import com.jsp.airlineproject.DTO.FlightDTO;
import com.jsp.airlineproject.DTO.FlightInformationDTO;
import com.jsp.airlineproject.DTO.InventoryDTO;
import com.jsp.airlineproject.Entity.AirLineInformation;
import com.jsp.airlineproject.Entity.Fare;
import com.jsp.airlineproject.Entity.Flight;
import com.jsp.airlineproject.Entity.FlightInformation;
import com.jsp.airlineproject.Entity.Inventory;

@Service
public class AdminServiceImp implements AdminService
{
	//To add AirLine Name
	@Autowired
	private AirLineRepository airLineRepository;
	@Override
	public int addAirLine(AirLineInformationDTO dto) 
	{
		AirLineInformation alInformation=airLineRepository.save(AirLineInformation.builder()
				.airLineName(dto.getAirLineName()).build());
		return alInformation.getAirLineId();
	}
	
	//To add Flight Information
	@Autowired
	private FlightInfoRepository flightInfoRepository;
	@Override
	public int addFlightInfo(FlightInformationDTO dto)
	{
		FlightInformation flInformation=flightInfoRepository.save(FlightInformation.builder()
				.flightNumber(dto.getFlightNumber()).flightType(dto.getFlightType()).build());
		return flInformation.getFlightInformationId();
	}
	

	//To add Fare Details
	@Autowired
	private FareRepository fareRepository;
	@Override
	public int addFareDetails(FareDTO dto) 
	{
		Fare fare=fareRepository .save(Fare.builder().currency(dto.getCurrency()).amount(dto.getAmount()).build());
		return fare.getFareId();
	}
	//To add Inventory details
	@Autowired
	private InventoryRepository inventoryRepository;
	@Override
	public int addInventory(InventoryDTO dto)
	{
		Inventory inventory=inventoryRepository.save(Inventory.builder().count(dto.getCount()).build());
		return inventory.getCount();
	}
	//To add data into flight table Flight
	@Autowired
	private FlightRepository flightRepository;
	@Override
	public int addFlight(FlightDTO dto) 
	{
		Flight flight=flightRepository.save(Flight.builder().destination(dto.getDestination())
				.flightDate(dto.getFlightDate()).flightNumber(dto.getFlightNumber())
				.flightTime(dto.getFlightTime()).currentLocation(dto.getCurrentLocation()).build());
		return flight.getFlightId();
	}
}
