package com.wipro.userms.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="users")
@Data
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="user_name")
    String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="user_address")
    String userAddress;
}
