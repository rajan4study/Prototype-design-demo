/**
 * 
 */
package com.study.prototype.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajan
 *
 */
public class CarShowroom implements Cloneable{
	private String name;
	private List<Car> cars=new ArrayList<>();
	@Override
	public String toString() {
		return "CarShowroom [name=" + name + ", cars=" + cars + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	/**
	 *It is shallow copy
	 */
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
	
	/**
	 *deep copy
	 */
	public CarShowroom clone() throws CloneNotSupportedException {
		CarShowroom showroom= new CarShowroom();
		for(Car car:this.cars) {
			showroom.getCars().add(car);
		}
		return showroom;
	}
	

}
