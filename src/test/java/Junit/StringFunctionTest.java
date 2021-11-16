package Junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class StringFunctionTest {

	
	@Test
	@DisplayName("Positive Test")
	public void test1()
	{
		assertTrue(StringFuction.isPlaindrome("NITIN"));
	}
	
//	@Disabled
	@Test
	@DisplayName("Negative Test")
	
//	@CustomAnnotation
	public void test2()
	{
		assertFalse(StringFuction.isPlaindrome("abcd"));
	}
}
