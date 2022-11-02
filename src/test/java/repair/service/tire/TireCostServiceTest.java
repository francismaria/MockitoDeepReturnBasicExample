package repair.service.tire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TireCostServiceTest {

	private TireCostService toTest;

	@BeforeEach
	void setup() {
		toTest = new TireCostService();
	}
	
	@Test
	void getRepairCost_returnsExpectedValue() {
		assertEquals(200.0, toTest.getRepairCost());
	}
}
