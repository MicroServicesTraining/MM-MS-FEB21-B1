/**
 * 
 */
package com.mm.sb.demo1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "<h1>Hello...!</h1>";
	}

}
