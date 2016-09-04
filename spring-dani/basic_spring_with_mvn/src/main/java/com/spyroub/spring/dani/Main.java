package com.spyroub.spring.dani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spyroub.spring.dani.writer.ConsoleWriter;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring-beans.xml");
		System.out.println(ac.getBeansOfType(ConsoleWriter.class));
	}
}
