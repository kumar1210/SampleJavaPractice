/**
 * 
 */
package org.kumar.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author gaurkuku
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4257813143584210258L;
	
	private String name;
	private int age;
	private transient Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 *  This method will be called while converting an object to stream 
	 * @param oos
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(address.getHouseNumber());
	}

	/**
	 * 
	 * 	This method will be called while converting stream to object
	 * @param ois
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		Integer houseNumber = (Integer) ois.readObject();
		Address a = new Address();
		a.setHouseNumber(houseNumber);
		this.setAddress(a);
	}
	
	@Override
	public String toString() {
		return this.name + " " + this.age+ " "+ this.address.getHouseNumber();
	}
}

class Address {

	private int houseNumber;

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

}