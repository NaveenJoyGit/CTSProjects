package com.moviecruiser.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;

import com.moviecruiser.model.Role;
import com.moviecruiser.model.User;
import com.moviecruiser.repository.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;

@Component
public class JwtFilter extends BasicAuthenticationFilter {
	
	@Autowired
	private UserRepository userrepo;

	public JwtFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String header = request.getHeader("Authorization");
		UsernamePasswordAuthenticationToken authentication = getAuthentication(request);

		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(request, response);
	}

	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if (token != null) {
     // parse the token. 
		Jws<Claims> jws;
		try {
			jws = Jwts.parser().setSigningKey("ABC123").parseClaimsJws(token.replace("Bearer ", ""));
			String username = jws.getBody().getSubject();
			User user = userrepo.findByUsername(username);
			List<Role> roles = user.getRoleList();
			ArrayList<SimpleGrantedAuthority> arr = new ArrayList<>();
			// Get the role list from UserRepo
			for(Role role : roles) {
				arr.add(new SimpleGrantedAuthority(role.getRolename()));
			}
			if (user != null) {
				return new UsernamePasswordAuthenticationToken(user, null, arr);
			}
		} catch (JwtException ex) {
			return null;
		}
		return null;
	}
	return null;
	}

}
