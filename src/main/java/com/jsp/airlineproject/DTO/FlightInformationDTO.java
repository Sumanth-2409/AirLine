package com.jsp.airlineproject.DTO;

import com.jsp.airlineproject.Entity.AirLineInformation;

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
public class FlightInformationDTO
{
	private int flightInformationId;
	private int flightNumber;
	private String flightType;
	
	private AirLineInformation airLineInformation;
}
