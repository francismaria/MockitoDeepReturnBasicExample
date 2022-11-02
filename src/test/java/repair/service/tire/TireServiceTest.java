package repair.service.tire;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import repair.service.engine.EngineCostService;
import repair.service.engine.EngineService;

class TireServiceTest {

	private TireService toTest;

	@BeforeEach
	void setup() {
		toTest = new TireService();
	}

	@Test
	void createCostServiceInstance_returnsExpectedValue() {
		assertThat(toTest.createCostServiceInstance(), instanceOf(TireCostService.class));
	}
}
