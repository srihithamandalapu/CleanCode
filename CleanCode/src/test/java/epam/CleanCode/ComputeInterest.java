package epam.CleanCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComputeInterest {

	Calculate obj;
	@BeforeEach
	void create()
	{
		obj = new Calculate();
	}
	@Test
	void test_1() {
		
		float interest = obj.compute_simpleinterest(100000,2,5);//princpal,time,interest
		assertEquals(10000,interest);
	}
	

	@Test
	void test_2()
	{
		
		float interest = obj.compute_simpleinterest(300000,3, 2);
		assertEquals(18000,interest);
	}
	
	@Test
	void test_3() {
		
		double interest = obj.compute_compoundinterest(100000,2,5);
		assertEquals(10250,interest);
	}
	
	@Test
	void test_4() {
		
		
		double interest = obj.compute_compoundinterest(10000,10,1);
		assertEquals(1047,interest);
	}

}
