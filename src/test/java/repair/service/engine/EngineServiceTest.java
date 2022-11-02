package repair.service.engine;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EngineServiceTest {
	
	private EngineService toTest;

	@BeforeEach
	void setup() {
		toTest = new EngineService();
	}

	@Test
	void createCostServiceInstance_returnsExpectedValue() {
		assertThat(toTest.createCostServiceInstance(), instanceOf(EngineCostService.class));
	}
}
