package com.Utilities;

import cucumber.api.java.Before;

public class BeforeClass {
		
	@Before
		public static void setUp() {
			System.out.println("Chrome driver initialized.");
			SetupDriver.getChromeDriver();
			System.out.println("Chrome driver End");
	}
}