/**
 * 
 */
package com.mm.sb.props.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mm.sb.props.demo.config.MMPropsConfiguration;

/**
 * @author USER
 *
 */
@RestController
@RequestMapping("propsdemo")
public class PropsDemoController {
	
	/*
	 * @Value("${mm.welcome.message}") private String welcomeMessage;
	 * 
	 * @Value("${mm.wish.message}") private String wishMessage;
	 */
	
	@Autowired
	private MMPropsConfiguration props;
	
	@Value("${message}")
	private String message;
	
	@GetMapping
	public String getWelcomeMessage() {
		//return welcomeMessage + "<br />" + wishMessage;
		//return props.getWelcomeMessage() + "<br />" + props.getWishMessage();
		return props.getWelcome() + "<br />" + props.getWish() +"<br />" + message;
	}

}
