/**
 * 
 */
package com.mm.sb.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("welcome")
public class WelcomeController {

	@RequestMapping(path="saywelcome", method=RequestMethod.GET)
	public String showWelcome() {
		return "<h1>Welcome User </h1>";
	}
	
}
