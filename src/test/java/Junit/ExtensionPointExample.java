package Junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;


@ExtendWith(EnvCheck.class)
public class ExtensionPointExample {

	
	@Test
	@DisplayName("Positive Test")
	public void test1()
	{
		assertTrue(StringFuction.isPlaindrome("NITIN"));
	}
	
//	@Disabled
	@Test
	@DisplayName("Negative Test")
	public void test2()
	{
		assertFalse(StringFuction.isPlaindrome("abcd"));
	}
}
