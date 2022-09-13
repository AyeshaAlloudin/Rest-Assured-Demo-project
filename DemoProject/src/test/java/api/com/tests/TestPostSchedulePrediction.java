package api.com.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import api.com.calls.PostSchedulePrediction;

public class TestPostSchedulePrediction  {
	static PostSchedulePrediction sp = new PostSchedulePrediction();

	@Test
	public static void testgettstaticmodel() throws IOException {
		sp.postsechudleprediction();

	}

}
