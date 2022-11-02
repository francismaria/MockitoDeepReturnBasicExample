package repair.service.engine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EngineServiceTest {
	
	private EngineService toTest;

	@BeforeEach
	void setup() {
		toTest = new EngineService();
	}

	@Test
	void getRepairCost_returnsExpectedValue() {
		assertEquals(1000.50, toTest.getRepairCost());
	}

}
