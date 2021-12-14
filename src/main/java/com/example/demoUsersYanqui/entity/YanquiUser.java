package com.example.demoUsersYanqui.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("yanquiuser")
public class YanquiUser {
	@Id
	private int id;
	private String fullName;
	private String dni;
	private String phone;
	private String imei;
	private String email;
	private String password;
	private double amount;
}
