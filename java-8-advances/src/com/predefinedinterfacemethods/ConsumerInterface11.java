package com.predefinedinterfacemethods;

import java.util.function.Consumer;

public class ConsumerInterface11 {

	static void printMessage(String msg) {
		System.out.println("Hello "+msg);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<String> c=ConsumerInterface11::printMessage;
		c.accept("karthik");
	}

}
