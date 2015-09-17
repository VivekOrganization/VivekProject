package com.mywallet.controller;

import java.math.BigInteger;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mywallet.model.UserProfile;

@RestController
public class UserProfileController {
	
	@RequestMapping(
			value = "/core-api/users",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public ResponseEntity<UserProfile> getUser() {
		UserProfile profile = new UserProfile(BigInteger.ONE, "Ankit");
		
		return new ResponseEntity<UserProfile>(profile, HttpStatus.OK);
	}

}
