package epam.CleanCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstimateHouseConstructionCost {

	CalculateCost obj;
	
	@BeforeEach
	void create() {
		obj = new CalculateCost();
	}
	@Test
	void test_1() {
		int cost = obj.compute_cost("StandardMaterial",1000);
		assertEquals(cost,1200000);
	}
	
	@Test
	void test_2() {
		int cost = obj.compute_cost("AboveStandardMaterial", 1200);
		assertEquals(cost,1800000);
	}
	
	@Test
	void test_3() {
		int cost = obj.compute_cost("HighStandardMaterial", 500);
		assertEquals(cost,900000);
	}
	
	@Test
	void test_4() {
		int cost = obj.compute_cost("HighStandardMaterial_AutomatedHome", 700);
		assertEquals(cost,1750000);
	}

}
