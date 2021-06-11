package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		FileSystemResource resource = null;
		BeanFactory factory = null;
		WishMessageGenerator wmg = null;
		// locate & hold spring bean cfg file
		resource = new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		// create BeanFactory container
		factory = new XmlBeanFactory(resource);
		// get target class object
		wmg = (WishMessageGenerator) factory.getBean("wmg");
		// invoke business method
		System.out.println(wmg.generateWishMsg("SriRam"));
	}// main(-)

}// class
