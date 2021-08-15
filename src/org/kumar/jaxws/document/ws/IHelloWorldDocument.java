/**
 * 
 */
package org.kumar.jaxws.document.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author gaurkuku
 *
 */
@WebService  
@SOAPBinding(style = Style.DOCUMENT)  
public interface IHelloWorldDocument {
	
	@WebMethod
	public String getDocumentHelloWorld(String name);
	
}
