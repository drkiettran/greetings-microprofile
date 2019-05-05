package com.drkiettran.microprofile.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.lang.management.ManagementFactory;

/**
 * Greetings class
 * 
 */
public class Greetings {
	public String hello(String name) throws UnknownHostException {
		return String.format("Hello, '%s' from %s/%s", name, InetAddress.getLocalHost().getHostName(),
				ManagementFactory.getRuntimeMXBean().getName());

	}
}
