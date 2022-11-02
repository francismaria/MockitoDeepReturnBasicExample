package repair.service.tire;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TireServiceTest {

	private TireService toTest;

	@BeforeEach
	void setup() {
		toTest = new TireService();
	}

	@Test
	void getRepairCost_returnsExpectedValue() {
		assertEquals(200.0, toTest.getRepairCost());
	}

}
