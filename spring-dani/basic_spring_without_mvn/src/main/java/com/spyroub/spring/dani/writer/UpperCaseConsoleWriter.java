package com.spyroub.spring.dani.writer;

public class UpperCaseConsoleWriter implements ConsoleWriter {

	@Override
	public void writeToConsole(String s) {
		System.out.println(s.toUpperCase());
	}

}
