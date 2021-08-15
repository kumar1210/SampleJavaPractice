/**
 * 
 */
package org.kumar.jaxws.rpc.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author gaurkuku
 *
 */
@WebService  
@SOAPBinding(style = Style.RPC)  
public interface IHelloWorld {
	
	@WebMethod
	public String getHelloWorldAsString(String name);
	
	@WebMethod
	public String getSampleReturn() ;
}
