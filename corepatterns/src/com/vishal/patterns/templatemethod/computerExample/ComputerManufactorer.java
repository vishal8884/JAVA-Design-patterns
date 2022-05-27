package com.vishal.patterns.templatemethod.computerExample;

public abstract class ComputerManufactorer {

	public void buildComputer() {
		String hardDisk = addHardDisk();
		
		String ram = addRAM(hardDisk);
		System.out.println("ram :: "+ram);
		
		String keyboard = addKeyboard();
		System.out.println("keyboard :: "+keyboard);
	}
	
	public abstract String addHardDisk();
	
	public abstract String addRAM(String hardDisc);
	
	public abstract String addKeyboard();
}
