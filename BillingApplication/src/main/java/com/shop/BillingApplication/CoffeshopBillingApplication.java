package com.shop.BillingApplication;

//import org.springframework.boot.*;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shop.UIDesign.MainUI;

//Note: this project initially started Spring boot after that changed.

//@SpringBootApplication // it is annotation used in spring boot
// annotation purpose is a.COnfigure class b.enable auto configure c.scan
// package for component
public class CoffeshopBillingApplication {

	public static void main(String[] args) { // main method java entry point to start execution
		// static ->is used for without create object we can run
		// void ->no retrun
		// main -> JVM starting method
		System.out.println("helloword");
		// SpringApplication.run(CoffeshopBillingApplication.class, args);
		try {
			MainUI ui = new MainUI();
			ui.show();

		} catch (Exception e) {

			System.out.println("APP MAIN FUNCTION ERROR CAPTURED AS :" + e);
		}
	}

}
