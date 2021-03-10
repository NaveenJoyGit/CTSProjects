package com.moviecruiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.moviecruiser.model.User;
import com.moviecruiser.repository.UserRepository;
import com.moviecruiser.security.UserPrinciple;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userrepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userrepo.findByUsername(username);
		if(user == null) throw new UsernameNotFoundException("ERROR!!!!!");
		return new UserPrinciple(user);
	}

}
