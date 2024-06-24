package com.excelr.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.excelr.model.User;
import com.excelr.repo.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repo.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("user not found with following email id"+username);
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),user.getRoles());
	}

}