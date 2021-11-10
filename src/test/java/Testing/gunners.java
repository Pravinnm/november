package Testing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class gunners {

	
	public class TestA {
		
		@Test(priority=10, invocationCount=3)
		private void tc1() {
			System.out.println("@AfterMethod");
			
		}
		@AfterSuite
		private void tc2() {
			System.out.println("@AfterMethod");
			
		}
		@Test(priority=40, enabled= false)
		private void tc3() {
			System.out.println("@BeforeSuite");
			
		}
		@BeforeMethod
		private void tc4() {
			System.out.println("@BeforeMethod");
			
		}
	    @AfterClass
		private void tc5() {
			System.out.println("@AfterClass");
			
		}
	    @BeforeClass
		private void tc6() {
			System.out.println(" @BeforeClass");
			
		}
	}

}
