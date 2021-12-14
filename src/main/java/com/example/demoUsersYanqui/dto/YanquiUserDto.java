package com.example.demoUsersYanqui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class YanquiUserDto {
	private int id;
	private String fullName;
	private String dni;
	private String phone;
	private String imei;
	private String email;
	private String password;
	private double amount;
}	
