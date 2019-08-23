package com.jiangcz.theory.designpattern.factory.staticfactory_level2;

import com.jiangcz.theory.designpattern.factory.commonfactory_level1.Sender;

public class FactoryTest {

	public static void main(String[] args) {
		//SendFactory factory = new SendFactory();
		//Sender mailSender = factory.produceMail();
		Sender mailSender = SendFactory.produceMail();
		mailSender.send();
	}
}