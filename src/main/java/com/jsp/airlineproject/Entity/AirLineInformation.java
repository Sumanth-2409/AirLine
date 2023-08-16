package com.jsp.airlineproject.Entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class AirLineInformation 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airLineId;
	private String airLineName;
	
	@OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "airLineInformation")
    private List<FlightInformation> flightInformation;
}
