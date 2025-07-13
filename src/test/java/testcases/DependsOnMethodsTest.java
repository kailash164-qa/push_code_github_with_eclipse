package testcases;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {

	// dependent methods
	@Test(dependsOnMethods = {"b"})
	public void a() {

		System.out.println("register the application first!!");
	}

	@Test()
	public void b() {

		System.out.println("login and execute after register");
	}

	@Test
	public void c() {

		System.out.println("order items  and execute after register and login ");
	}

	@Test(priority = -1,    dependsOnMethods = {"b","a","c"})
	public void d() {

		System.out.println("logout and execute after register,login,order");
	}

}
