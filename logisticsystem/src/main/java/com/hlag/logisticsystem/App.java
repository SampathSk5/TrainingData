package com.hlag.logisticsystem;

import com.hlag.logisticsystem.dto.Package;

public class App {

	public static void main(String[] args) {

		Package package1 = Package.getInstance();
		Package package2 = Package.getInstance();
		System.out.println(package1.equals(package2));
		System.out.println(package1.hashCode());
		System.out.println(package2.hashCode());
	}

}
