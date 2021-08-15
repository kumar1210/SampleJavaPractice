/**
 * 
 */
package org.kumar.rpc.endpoint;

import javax.xml.ws.Endpoint;

import org.kumar.rpc.ws.HelloWorldImpl;

/**
 * @author gaurkuku
 *
 */
public class HelloWorldPublisher {
	
	public static final String URL = "http://localhost:8080/ws/hello";

	public static void main(String[] args) {
		System.out.println("--------------------- Starting the Publisher -------------------");
		Endpoint.publish(URL, new HelloWorldImpl());
		System.out.println("--------------------- Publisher has launched successfully with UrL : "+ URL +" -------------------");
	}
}
