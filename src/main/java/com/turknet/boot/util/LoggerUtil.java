package com.turknet.boot.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerUtil<T> {
	
	private Class<T> clazz;  
	
	private final Logger LOG = LoggerFactory.getLogger(clazz);
	
	public void Log(String msg)
	{
		LOG.debug(msg);
	}
}
