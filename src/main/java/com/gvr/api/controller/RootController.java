package com.gvr.api.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gvr.api.model.GvrServiceCallReport;
import com.gvr.api.service.GvrService;

/**
 * This is RootController class consists method, used to handle HTTP request.
 * 
 * @author Kaushal
 * @since 02-09-2017
 */
@RestController
@RequestMapping(value = "/gvrApp")
public class RootController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(RootController.class);

	@Autowired
	GvrService gvrService;

	/**
	 * test by echo message.
	 * 
	 * @return String
	 */
	@RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
	public String echo(@PathVariable String str) {
		return str;
	}

	/**
	 * get Time stamp and no of calls service calls.
	 * 
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/gvrService", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	GvrServiceCallReport fetch() throws IOException {

		LOGGER.info("get Time stamp and no of calls service calls : {}");
		return gvrService.getTimeStumpandNoOfCalls();
	}

}
