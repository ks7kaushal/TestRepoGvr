package com.gvr.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main class with main method to boot the application.
 * 
 * @author Kaushal
 * @since 02-09-2017
 *
 */
@SpringBootApplication
public class DemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	/**
	 * This is main method to start spring Boot application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		logger.info("Booting Application..");
		SpringApplication.run(new Object[] { DemoApplication.class }, args);

	}
}
