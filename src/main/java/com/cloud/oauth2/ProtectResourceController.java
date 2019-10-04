package com.cloud.oauth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProtectResourceController {
	
	@RequestMapping(value="/protect1")
	public String protect1() {
		return "protect 1 for all user.";
	}

	@RequestMapping(value="/protect2")
	public String protect2() {
		return "protect 2 for admin.";
	}
}
