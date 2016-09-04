package com.spyroub.spring.dani.writer;

public class LowerCaseConsoleWriter implements ConsoleWriter {

	@Override
	public void writeToConsole(String s) {
		System.out.println(s.toLowerCase());
	}

}
