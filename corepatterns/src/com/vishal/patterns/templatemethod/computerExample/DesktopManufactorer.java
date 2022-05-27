package com.vishal.patterns.templatemethod.computerExample;

public class DesktopManufactorer extends ComputerManufactorer {

	@Override
	public String addHardDisk() {
		return "hard disc desktop";
	}

	@Override
	public String addRAM(String ram) {
		return "ram desktop :: "+ram;
	}

	@Override
	public String addKeyboard() {
		return "keyboard desktop";
	}

}
