# SampleJavaPractice
Java API's Sample

package 1 :
			: org.kumar.jaxws.rpc  -- it contains the JAX-WS RPC implementation
			: org.kumar.jaxws.document -- contains the JAX-WS document implementation
					
			Note : Main difference between JAX-WS RPC and Document implementation is, the style we are defining at the 
					org.kumar.jaxws.<service>.ws, i.e. @SOAPBinding(style = <style-name>)
					
package 2 : 
			: org.kumar.serialization  -- it contains the sample implementation of serialization
			Note : Check the "readObject" and "writeObject" in Employee.java
		
