/**
 * 
 */
package com.study.prototype;

import com.study.prototype.model.Car;
import com.study.prototype.model.CarShowroom;

/**
 * @author rajan
 *
 */
public class Demo {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		CarShowroom showroom1=new CarShowroom();
		showroom1.setName("showroom1");
		// this code for mocking data from db
		for(int i=0;i<10;i++) {
			Car car= new Car();
			car.setId(i);
			car.setName("car"+i);
			showroom1.getCars().add(car);
		}
//		CarShowroom showroom2=(CarShowroom)showroom1.clone();
		CarShowroom showroom2=showroom1.clone();
		showroom2.setName("showroom2");
		System.out.println(showroom1);
		System.out.println(showroom2);

	}

}
