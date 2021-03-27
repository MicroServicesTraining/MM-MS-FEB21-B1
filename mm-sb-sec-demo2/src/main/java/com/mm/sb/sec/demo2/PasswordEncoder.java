/**
 * 
 */
package com.mm.sb.sec.demo2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * @author dorak
 *
 */
public class PasswordEncoder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String password = "mm@123";
		String encodedPwd =  NoOpPasswordEncoder.getInstance().encode(password);
		System.out.println(encodedPwd);

		encodedPwd = new BCryptPasswordEncoder().encode(password);
		System.out.println(encodedPwd);
		
		encodedPwd = new Pbkdf2PasswordEncoder().encode(password);
		System.out.println(encodedPwd);
		
		encodedPwd = new StandardPasswordEncoder().encode(password);
		System.out.println(encodedPwd);
		
		
	}

}
