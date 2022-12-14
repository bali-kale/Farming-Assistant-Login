package com.cg.FarmingAssistant.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
	public class User {

	    @Id
	    @Column
	   
	    private String username;
	    private String name;
	    private String password;
	    private String role;
	    private String token;

	}


