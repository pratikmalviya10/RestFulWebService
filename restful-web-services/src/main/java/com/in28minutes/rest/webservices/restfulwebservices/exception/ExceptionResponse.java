package com.in28minutes.rest.webservices.restfulwebservices.exception;

import java.util.Date;

public class ExceptionResponse
{
   //timestamp
	private Date timestamp;
	
	//Exception message
	private String message;
	
	//detail
    private String details;

	public Date getTimestamp() 
	{
		return timestamp;
	}

	public String getMessage() 
	{
		return message;
	}

	public String getDetails() 
	{
		return details;
	}

	public ExceptionResponse(Date timestamp, String message, String details) 
	{
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}
	
    
	
    
    
    
}
