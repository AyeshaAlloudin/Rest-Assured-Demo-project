package api.com.tests;

import org.testng.annotations.Test;

import api.com.calls.GetResponseStaticCoverage;

public class TestGetRequestStaticCoverage {
	static GetResponseStaticCoverage sc = new GetResponseStaticCoverage();

	@Test
	public static void testgetstaticcover() {
		sc.getstaticcoverage();

	}
}
