/**
 * 
 */
package org.kumar.jaxws.common.endpoint;

import javax.xml.ws.Endpoint;

import org.kumar.jaxws.document.ws.HelloWorldDocumentImpl;
import org.kumar.jaxws.rpc.ws.HelloWorldImpl;

/**
 * @author gaurkuku
 *
 */
public class HelloWorldPublisher {

	public static final String RPCURL = "http://localhost:8080/ws/rpcHello";
	public static final String DOCUMENTURL = "http://localhost:8090/ws/docHello";

	public static void main(String[] args) {

		publishRPCEndpoint();
		publishDocumentEndpoint();
	}

	private static void publishDocumentEndpoint() {

		System.out.println("--------------------- Starting the DOCUMENT Publisher -------------------");
		Endpoint.publish(DOCUMENTURL, new HelloWorldDocumentImpl());
		System.out.println(
				"--------------------- DOCUMENT Publisher has launched successfully with UrL : " + DOCUMENTURL + " -------------------");
	}

	private static void publishRPCEndpoint() {

		System.out.println("--------------------- Starting the RPC Publisher -------------------");
		Endpoint.publish(RPCURL, new HelloWorldImpl());
		System.out.println(
				"--------------------- RPC Publisher has launched successfully with UrL : " + RPCURL + " -------------------");
	}
}
