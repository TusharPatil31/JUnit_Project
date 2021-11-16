package Junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionExample {
	
	@Test
	public void test() {
		
		String name1 = "Tushar";
		String name2 = "Tushar";
		
		assertEquals(name1,name2);
	
		String[] exceptedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		assertArrayEquals(exceptedArray, resultArray);
	}

}
