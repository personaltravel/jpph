package com.personalweb.hotel.expedia.api;

import com.personalweb.hotel.api.RESTWSClient;

/**
 * @version 1.0
 * @created 08-Jan-2013 23:48:15
 */
public class ExpediaRESTWSClient implements RESTWSClient {

	private String endPointURL;

	public ExpediaRESTWSClient() {

	}

	/**
	 * Method to post REST WS requests to Expedia API  
	 * @param request
	 */
	public String handleRequest(String request) {
		return "";
	}

	public String getEndPointURL() {
		return endPointURL;
	}

	public void setEndPointURL(String endPointURL) {
		this.endPointURL = endPointURL;
	}

}