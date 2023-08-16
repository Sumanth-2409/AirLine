package com.jsp.airlineproject.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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
@Entity
public class FlightInformation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightInformationId;
	private int flightNumber;
	private String flightType;

	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "air_line_id")
	private AirLineInformation airLineInformation;
	
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "flightInformation")
	private Flight flight;
	
	
	
}
