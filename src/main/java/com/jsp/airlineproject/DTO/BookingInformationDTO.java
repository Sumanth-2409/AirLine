package com.jsp.airlineproject.DTO;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class BookingInformationDTO
{
	private int bookingId;
	private LocalDate bookingDate;
	private String destination;
	private double fare;
	private Date flightDate;
	private int flightNumber;
	private String status;
	private LocalTime flightTime;
	private String currentCity;

}
