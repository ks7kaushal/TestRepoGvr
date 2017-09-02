package com.gvr.api.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.gvr.api.model.GvrServiceCallReport;

/**
 * This is a Repository. It implements All the method listed in GvrService.
 * 
 * @author Kaushal
 * @since 02-09-2017
 */
@Repository
public class GvrServiceImpl implements GvrService {

    private static final Logger LOGGER = LoggerFactory
            .getLogger(GvrServiceImpl.class);

    private static int calls=1;
    
    /**
     * Method to get Time stamp and no of calls to the service.
     * @return
     */
    @Override
    public GvrServiceCallReport getTimeStumpandNoOfCalls() {
        
        LOGGER.info("Fetching  Data");
        
    	GvrServiceCallReport gvrServiceCallReport = new GvrServiceCallReport();
    	gvrServiceCallReport.setTimeStamp(new Date());
    	gvrServiceCallReport.setCalls(calls);
    	calls++;
    	return gvrServiceCallReport;
    	
    }

}
