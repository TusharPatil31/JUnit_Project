package Junit;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

public class DynamicTestExamples {
	
	@TestFactory
	public Collection<DynamicTest> method()
	{
		return Arrays.asList(
				
				DynamicTest.dynamicTest("Postive Test1",
						() -> assertTrue(StringFuction.isPlaindrome("NITIN"))),
				
				DynamicTest.dynamicTest("Postive Test2",
						() -> assertTrue(StringFuction.isPlaindrome("oppo"))),
				
				DynamicTest.dynamicTest("Negative Test",
						() -> assertFalse(StringFuction.isPlaindrome("acdk")))
				
			);
	}

}
