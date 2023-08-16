package com.jsp.airlineproject.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airlineproject.DTO.AirLineInformationDTO;
import com.jsp.airlineproject.DTO.FareDTO;
import com.jsp.airlineproject.DTO.FlightDTO;
import com.jsp.airlineproject.DTO.FlightInformationDTO;
import com.jsp.airlineproject.DTO.InventoryDTO;

@RestController
@RequestMapping("/AirLineAPI/v0")
public class AdminController
{
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addALname")
	public ResponseEntity<String> addAirLine(@RequestBody AirLineInformationDTO dto)
	{
		int id=adminService.addAirLine(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Id " + id);
	}
//	int addAirLine(AirLineInformationDTO dto)
//	{
//		return adminService.addAirLine(dto);
//	}
	
	@PostMapping("/addFlightInfo/")
	ResponseEntity<String> addFlightInfo(@RequestBody FlightInformationDTO dto)
	{
		int id=adminService.addFlightInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Flight Info Id"+id);
	}
	@PostMapping("/addFareDetails/")
	ResponseEntity<String> addFareDetails(@RequestBody FareDTO dto)
	{
		int id=adminService.addFareDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Fare Id"+id);
	}
	@PostMapping("/addInventory")
	ResponseEntity<String> addInventory(@RequestBody InventoryDTO dto)
	{
		int id=adminService.addInventory(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Inventory Id"+id);
	}
	@PostMapping("/addFlights/")
	ResponseEntity<String> addFlight(@RequestBody FlightDTO dto)
	{
		int id=adminService.addFlight(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Flight Id"+id);
	}
	
	

}
