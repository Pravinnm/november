package Testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleA {
    @Test
	private void TC0() {
		System.out.println("Test1");
	}
    @Test
    private void TC1() {
    	Assert.assertTrue(false);
    	System.out.println("Test2");
    }
    @Test
    private void TC2() {
    	System.out.println("Test3");
    }
    @Test
    private void TC3() {
    	System.out.println("Test4");
    }
    @Test
    private void TC4() {
    	System.out.println("Test5");
    }
    @Test
    private void TC5() {
    	System.out.println("Test6");
    }
	
}
