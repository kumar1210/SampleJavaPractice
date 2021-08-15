/**
 * 
 */
package org.kumar.jaxws.document.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author gaurkuku
 *
 */

@WebService(endpointInterface = "org.kumar.jaxws.document.ws.IHelloWorldDocument")
@SOAPBinding(style = Style.DOCUMENT)
public class HelloWorldDocumentImpl implements IHelloWorldDocument{
	
	@Override
	public String getDocumentHelloWorld(String name) {
		return "Hello World of JAX-WS Document With " + name;
	}

}
