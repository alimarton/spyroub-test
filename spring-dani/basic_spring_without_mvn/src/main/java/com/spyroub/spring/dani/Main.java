package com.spyroub.spring.dani;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spyroub.spring.dani.writer.ConsoleWriter;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource") ApplicationContext ac = new GenericXmlApplicationContext("spring-beans.xml");
		System.out.println(ac.getBeansOfType(ConsoleWriter.class));
	}
}
