package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import Junit.StringFuction;

public class ClassBTest {
	
	@Tag("Sanity")
	@DisplayName("Test2")
	@Test
	
	public void Test1()
	{
		assertTrue(StringFuction.isPlaindrome("NITIN"));
	}

}