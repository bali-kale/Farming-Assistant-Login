package com.cg.FarmingAssistant;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.FarmingAssistant.Entity.User;
import com.cg.FarmingAssistant.Repository.UserRepository;
import com.cg.FarmingAssistant.Service.AuthService;

@SpringBootTest
public class TestCase {
	 @MockBean
	    private UserRepository repository;
	    @Autowired
	    private AuthService service;
	    @Test
	    public void addUser() {
	    User obj = new User("ankit","xyz@gmail.com","abcde", "user", "XAhP-ZbSHVVEZ6Ayst266EosP0E9KKEA");
	    when(repository.save(obj)).thenReturn(obj);
	    assertEquals(obj, service.register(obj));
	    }
	    private void assertEquals(User obj, User addUser) {
	        // TODO Auto-generated method stub
	    }
	    }


