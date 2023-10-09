package testng1;

import org.testng.annotations.Test;

public class test18 {
	//6)group the test cases as login
	public class test13 {
		@Test(groups={"smoke"})
		public void Testcase1() {
			System.out.println("smoke test1");
		}
		@Test(groups={"smoke","regression"})
		public void Testcase2() {
			System.out.println("smoke test2");
		}
		@Test(groups={"smoke"})
		public void Testcase3() {
			System.out.println("smoke test3");
		

	}
	}

}
