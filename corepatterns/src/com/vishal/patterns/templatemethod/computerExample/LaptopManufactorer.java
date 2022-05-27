package com.vishal.patterns.templatemethod.computerExample;

public class LaptopManufactorer extends ComputerManufactorer {

	@Override
	public String addHardDisk() {
		return "hard disc laptop";
	}

	@Override
	public String addRAM(String ram) {
		return "ram laptop :: "+ram;
	}

	@Override
	public String addKeyboard() {
		return "keyboard laptop";
	}

}
