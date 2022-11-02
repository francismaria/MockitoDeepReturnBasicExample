package repair.service.engine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import repair.service.tire.TireCostService;

class EngineCostServiceTest {
	
	private EngineCostService toTest;

	@BeforeEach
	void setup() {
		toTest = new EngineCostService();
	}
	
	@Test
	void getRepairCost_returnsExpectedValue() {
		assertEquals(1000.50, toTest.getRepairCost());
	}
}
