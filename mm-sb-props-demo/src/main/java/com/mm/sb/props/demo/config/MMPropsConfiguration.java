/**
 * 
 */
package com.mm.sb.props.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author USER
 *
 */

@Configuration
@PropertySource(value = {"classpath:custom.properties"})
@ConfigurationProperties(prefix = "mm.message")
public class MMPropsConfiguration {
	
	/*
	 * @Value("${mm.welcome.message}") private String welcomeMessage;
	 * 
	 * @Value("${mm.wish.message}") private String wishMessage;
	 */
	
	private String welcome;
	
	private String wish;

	/**
	 * @return the welcome
	 */
	public String getWelcome() {
		return welcome;
	}

	/**
	 * @param welcome the welcome to set
	 */
	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	/**
	 * @return the wish
	 */
	public String getWish() {
		return wish;
	}

	/**
	 * @param wish the wish to set
	 */
	public void setWish(String wish) {
		this.wish = wish;
	}
	
	
	/**
	 * @return the welcomeMessage
	 */
	/*
	 * public String getWelcomeMessage() { return welcomeMessage; }
	 */

	/**
	 * @param welcomeMessage the welcomeMessage to set
	 */
	/*
	 * public void setWelcomeMessage(String welcomeMessage) { this.welcomeMessage =
	 * welcomeMessage; }
	 */

	/**
	 * @return the wishMessage
	 */
	/*
	 * public String getWishMessage() { return wishMessage; }
	 */

	/**
	 * @param wishMessage the wishMessage to set
	 */
	/*
	 * public void setWishMessage(String wishMessage) { this.wishMessage =
	 * wishMessage; }
	 */
	
	
	

}
