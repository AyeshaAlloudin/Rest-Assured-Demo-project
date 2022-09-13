package api.com.tests;

import org.testng.annotations.Test;

import api.com.calls.GetAllResponsesTeamScore;

public class TestGetRequestTeamScore {
	static GetAllResponsesTeamScore resq = new GetAllResponsesTeamScore();

	@Test
	public static void testgetteamscore() {
		resq.getResponseBody();

	}

}
