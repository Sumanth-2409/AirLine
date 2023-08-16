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
public class PassengerDTO
{
	private int passengerId;
	private String emailId;
	private String firstName;
	private String lastName;
	private String gender;
	private int mobileNumber;
}
