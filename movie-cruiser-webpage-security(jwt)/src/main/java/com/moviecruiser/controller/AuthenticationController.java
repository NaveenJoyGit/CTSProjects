package com.moviecruiser.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.moviecruiser.model.AuthRequest;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class AuthenticationController {
	
	
	@GetMapping("/authenticate")
	@ResponseBody
	private Map<String, String>  getToken(@RequestHeader("Authorization") String authHeader) {
		Map<String, String> m = new HashMap<>();
		
		String user = getUser(authHeader);
		String token = generateJwt(user);
		m.put("token", token );
		return m;
		
	}

	private String getUser(String authHeader) {
		String baseStr = authHeader.substring(authHeader.indexOf("Basic ")+6);
		byte[] encCred = Base64.getDecoder().decode(baseStr);
		String encStr = new String(encCred);
		//log.debug("EncStr " +encStr);
		return encStr.substring(0, encStr.indexOf(":"));
	}
	
	private String generateJwt(String user) {
		JwtBuilder builder = Jwts.builder(); 
		 builder.setSubject(user); 
		 
		// Set the token issue time as current time 
		builder.setIssuedAt(new Date()); 
		 // Set the token expiry as 20 minutes from now 
		 builder.setExpiration(new Date((new Date()).getTime() + 1200000)); 
		 builder.signWith(SignatureAlgorithm.HS256, "ABC123"); 
		 
		 String token = builder.compact(); 
		 
		 return token; 
	}

	
	
}
