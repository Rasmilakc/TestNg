package testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test14a {
	@Test(dependsOnMethods = "addToCart")
	public void login() {
		System.out.println("Executing the login test case");
		Assert.assertEquals(true, true);
	}
	
	@Test(dependsOnMethods = "login")
	public void search(){
		System.out.println("Executing the search testcase");
		Assert.assertEquals(false, true);
	}	
	
	@Test(dependsOnMethods = "search")
	public void addToCart(){
		System.out.println("Adding the testcase to cart");
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void Payement(){
		System.out.println("Adding the testcase to cart");
	}

}


