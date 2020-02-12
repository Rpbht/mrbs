package com.cignex.mrbs.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating MrbsLogger objects.
 *
 * @author rahul.panchal
 */
public final class MrbsLoggerFactory {

    /**
     * private constructor for Singleton object.
     */
    private MrbsLoggerFactory() {

    }

    /**
     * Method getWebFormLogger.
     * 
     * @param clazz class
     * 
     * @return Logger
     */
    public static Logger getWebFormLogger(Class<?> clazz) {

	return LoggerFactory.getLogger(clazz);
    }

    /**
     * Method getWebFormLoggerName.
     * 
     * @param name String
     * 
     * @return Logger
     */
    public static Logger getWebFormLoggerName(String name) {

	return LoggerFactory.getLogger(name);
    }
}
