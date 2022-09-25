package com.vishal.patterns.commandPattern;

public class Person {

	public static void main(String[] args) {

		Television television = new Television();
		
		RemoteControl remoteControl = new RemoteControl();
		
		Command onCommand = new OnCommand(television);
		
		remoteControl.setCommand(onCommand);
		remoteControl.pressButton();
		
		
		Command offComand = new OffCommand(television);
		
		remoteControl.setCommand(offComand);
		remoteControl.pressButton();
	}

}
