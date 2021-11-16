package Junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssemptionExample {
	
	@BeforeEach
	public void setup()
	{
		System.setProperty("ENV","DEV");
	}
	
	@Test
	public  void test() {
		
		String ExceptedEnv = "DEV";
		String Result = System.getProperty("ENV");
		
		
		
		
		
	}

}
