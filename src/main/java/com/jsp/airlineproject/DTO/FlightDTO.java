package com.jsp.airlineproject.DTO;

import java.sql.Time;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class FlightDTO 
{
	private int flightId;
	private String destination;
	private Date flightDate;
	private int flightNumber;
	private Time flightTime;
	private String currentLocation;
	
}
