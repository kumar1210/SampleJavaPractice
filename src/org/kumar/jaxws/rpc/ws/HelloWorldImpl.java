/**
 * 
 */
package org.kumar.jaxws.rpc.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author gaurkuku
 *
 */

@WebService(endpointInterface = "org.kumar.jaxws.rpc.ws.IHelloWorld")
@SOAPBinding(style = Style.RPC)
public class HelloWorldImpl implements IHelloWorld{
	
	@Override
	public String getRPCHelloWorld(String name) {
		return "Hello World of JAX-WS RPC With " + name;
	}

	@Override
	public String getSampleReturn() {
		return "Other Method Checked";
	}
}
