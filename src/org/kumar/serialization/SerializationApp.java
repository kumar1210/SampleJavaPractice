/**
 * 
 */
package org.kumar.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author gaurkuku
 *
 */
public class SerializationApp {

	private static final String fileLocation = "resources/outStream.txt";

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = new Employee();
		emp.setAge(30);
		emp.setName("Gaurav");
		Address address = new Address();
		address.setHouseNumber(1920);
		emp.setAddress(address);

		convertObjectToStream(emp);
		Employee streamedObj = (Employee) convertStreamToObject();

		System.out.println(streamedObj.toString());

	}

	private static void convertObjectToStream(Employee emp) throws IOException {

		FileOutputStream fileOut = new FileOutputStream(fileLocation);
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		outStream.writeObject(emp);
		outStream.flush();
		outStream.close();
	}

	private static Object convertStreamToObject() throws IOException, ClassNotFoundException {

		FileInputStream fileInput = new FileInputStream(fileLocation);
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		Object obj = objectInput.readObject();
		objectInput.close();
		return obj;
	}
}
