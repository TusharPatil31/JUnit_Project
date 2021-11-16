package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public interface DefaultTestInterface {

	
	public void Method1();
	public void Method2();
	
	@RepeatedTest (3)
	default void test()
	{
		assertTrue(StringFuction.isPlaindrome("oppo"));
	}
	
	
}
