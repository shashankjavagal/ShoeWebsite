package com.Shoppingcart.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.Shoppingcart.Model.User;
import com.Shoppingcart.dao.UserRegistrationDto;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
