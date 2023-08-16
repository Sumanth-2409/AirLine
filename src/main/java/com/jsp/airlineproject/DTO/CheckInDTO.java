package com.jsp.airlineproject.DTO;

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
public class CheckInDTO
{
	private int checkInId;
	private int seatNumber;
	private int gateNumber;
}
