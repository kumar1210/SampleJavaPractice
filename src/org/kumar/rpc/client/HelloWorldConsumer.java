package org.kumar.rpc.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.kumar.rpc.ws.IHelloWorld;

public class HelloWorldConsumer {
	
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://localhost:8080/ws/hello?wsdl");

		// 1st argument service URI, refer to wsdl document above
		// 2nd argument is service name, refer to wsdl document above
		QName qname = new QName("http://ws.rpc.kumar.org/", "HelloWorldImplService");
		Service service = Service.create(url, qname);
		IHelloWorld hello = service.getPort(IHelloWorld.class);
		System.out.println(hello.getHelloWorldAsString(" a sample example"));
	}
}