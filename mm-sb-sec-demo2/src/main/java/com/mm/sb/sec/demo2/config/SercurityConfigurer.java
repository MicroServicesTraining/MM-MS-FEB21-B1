/**
 * 
 */
package com.mm.sb.sec.demo2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author dorak
 *
 */
@Configuration
@EnableWebSecurity
public class SercurityConfigurer extends WebSecurityConfigurerAdapter {

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder)
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// configure user credentials and method of authentication
		auth.inMemoryAuthentication().withUser("varun").password("{bcrypt}$2a$10$XUaXqkUfQ5lekbwG5jBlXuQfzdoNkPmhkG0b0squropjJ3TGgcbc6").roles("ADMIN")
			.and().withUser("kiran").password("{pbkdf2}5490e282ce96bd41baff93b1b398574223d43f5512c2cae375b9054ba63a9f01defcb0397521e30a").roles("CUSTOMER")
			.and().withUser("naveen").password("{sha256}12a0d8df50d8b98ba46a87d2f5e7e6c0a1621461142f7567cea8d084b6bac9187d4a932e19e9e698").roles("CUSTOMER");
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter#configure(org.springframework.security.config.annotation.web.builders.HttpSecurity)
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// configure authorizations of users		
		http.authorizeRequests()
		.antMatchers("/users/adminhome")
		.hasRole("ADMIN")
		.antMatchers("/users/cutomerhome")
		.hasAnyRole("CUSTOMER", "ADMIN")
		.antMatchers("/users/hello").permitAll()
		.and().formLogin();
	}	
}
