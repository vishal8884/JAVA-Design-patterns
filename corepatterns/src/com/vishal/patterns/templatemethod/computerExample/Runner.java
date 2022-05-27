package com.vishal.patterns.templatemethod.computerExample;

public class Runner {

	public static void main(String[] args) {

		ComputerManufactorer cm = new LaptopManufactorer();

		cm.buildComputer();

		ComputerManufactorer cm2 = new DesktopManufactorer();

		cm2.buildComputer();
	}
}
