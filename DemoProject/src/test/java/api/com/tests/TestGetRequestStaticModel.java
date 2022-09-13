package api.com.tests;

import org.testng.annotations.Test;

import api.com.calls.GetResponseStaticModel;

public class TestGetRequestStaticModel {
	static GetResponseStaticModel sm = new GetResponseStaticModel();

	@Test
	public static void testgettstaticmodel() {
		sm.getstaticmodel();

	}

}
