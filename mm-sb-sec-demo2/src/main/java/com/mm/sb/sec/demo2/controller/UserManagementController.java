/**
 * 
 */
package com.mm.sb.sec.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dorak
 *
 */

@RestController
@RequestMapping("users")
public class UserManagementController {

	@GetMapping("hello")
	public String sayHello() {
		return "Hello from UserManagementController";
	}
	
	@GetMapping("adminhome")
	public String gotoAdminPage() {
		return "<h1>Welcome Admin</h1>";
	}
	
	@GetMapping("cutomerhome")
	public String gotoCustomerPage() {
		return "<h1>Welcome Customer</h1>";
	}
	
}
