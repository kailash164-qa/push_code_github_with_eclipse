package testcases;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 3)
	public void a() {
		System.out.println("A");
	}

	@Test(priority = 3)
	public void b() {
		System.out.println("B");
	}
	@Test
	public void f() {
		System.out.println("F");
	}
	@Test(priority = 0)
	public void c() {
		System.out.println("C");
	}

	@Test(priority = -2)
	public void d() {
		System.out.println("D");
	}
	
	
	@Test(priority = -2)
	public void D() {
		System.out.println("Caps D");
	}

	@Test(priority = 0)
	public void e() {
		System.out.println("E");
	}

	// grouping

	@Test(groups = "sanity")
	public void test1() {
		System.out.println("only sanity");
	}

	@Test(groups = "smoke")
	public void test2() {
		System.out.println("only smoke");
	}

	@Test(groups = "regression")
	public void test4() {
		System.out.println("only regression");
	}

	@Test(groups = { "smoke", "regression" })
	public void test3() {
		System.out.println("regression and smoke");
	}

	// parameter
	@Test(priority = 22)
	@Parameters({ "browser", "url" })
	public void lunchBrowserAndUrl(@Optional("defaultBrowser") String browser, @Optional("defaultUrl") String url) {

		System.out.println("Launching Browser:" + browser);
		System.out.println("Hit the Url:" + url);
	}

	
}
