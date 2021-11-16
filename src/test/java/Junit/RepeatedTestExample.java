package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestExample {
	
	@RepeatedTest (4)
	public void test1()
	{
		assertTrue(StringFuction.isPlaindrome("NITIN"));
	}
	

}
