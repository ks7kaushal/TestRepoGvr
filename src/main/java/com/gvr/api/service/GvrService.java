package com.gvr.api.service;

import com.gvr.api.model.GvrServiceCallReport;

/**
 * This is an interface, Define all the methods implemented in
 * GvrServiceImpl class which acts as a Repository.
 * 
 * @author Kaushal
 * @since 02-09-2017
 */
public interface GvrService {

    /**
     * Method to get Time stamp and no of calls to the service.
     * 
     * @return
     */

    GvrServiceCallReport getTimeStumpandNoOfCalls();
    
}
