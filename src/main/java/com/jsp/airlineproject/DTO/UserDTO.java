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
public class UserDTO 
{
	private int userId;
	private String firstName;
	private String lastName;
	private int mobileNumber;
	private String gender;
	private String userName;
	private String password;

}
