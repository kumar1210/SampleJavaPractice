package org.kumar.jaxws.common.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.kumar.jaxws.document.ws.IHelloWorldDocument;
import org.kumar.jaxws.rpc.ws.IHelloWorld;

public class HelloWorldConsumer {
	
	public static final String RPC_WSDL = "http://localhost:8080/ws/rpcHello?wsdl";
	public static final String RPC_NAMESPACE_URI = "http://ws.rpc.jaxws.kumar.org/";
	public static final String RPC_SERVICE_NAME = "HelloWorldImplService";
	
	public static final String DOC_WSDL = "http://localhost:8090/ws/docHello?wsdl";
	public static final String DOC_NAMESPACE_URI = "http://ws.document.jaxws.kumar.org/";
	public static final String DOC_SERVICE_NAME = "HelloWorldDocumentImplService";

	public static void main(String[] args) throws Exception {

		System.out.print("Invoking RPC Client : ");
		Service rpcService = clientInvocation(RPC_WSDL, RPC_NAMESPACE_URI, RPC_SERVICE_NAME);
		IHelloWorld rpcHello = rpcService.getPort(IHelloWorld.class);
		System.out.println(rpcHello.getRPCHelloWorld("a sample example"));
		
		System.out.print("Invoking Document Client : ");
		Service docService = clientInvocation(DOC_WSDL, DOC_NAMESPACE_URI, DOC_SERVICE_NAME);
		IHelloWorldDocument docHello = docService.getPort(IHelloWorldDocument.class);
		System.out.println(docHello.getDocumentHelloWorld("a sample example"));
	}

	private static Service clientInvocation(String wsdlUrl, String namespace, String serviceName) {

		
		try {
			URL url = new URL(wsdlUrl);
			// 1st argument service URI, refer to wsdl document above
			// 2nd argument is service name, refer to wsdl document above
			QName qname = new QName(namespace, serviceName);
			return Service.create(url, qname);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;

		
	}
	
}