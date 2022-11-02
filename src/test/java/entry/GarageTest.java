package entry;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import entry.Garage;
import entry.RepairType;
import repair.service.engine.EngineService;
import repair.service.tire.TireService;

@ExtendWith(MockitoExtension.class)
class GarageTest {
	
	@Mock
	private TireService tireService;
	@Mock
	private EngineService engineService;
	
	private Garage toTest;

	@BeforeEach
	void setup() {
		toTest = new Garage(tireService, engineService);
	}
	
	@Test
	void getRepairCost_tireRepairType_returnsTireServiceCost() {
		when(tireService.getRepairCost()).thenReturn(500.0);
		
		assertEquals(500.0, toTest.getCostForRepair(RepairType.TIRE));
	}

	@Test
	void getRepairCost_engineRepairType_returnsEngineServiceCost() {
		when(engineService.getRepairCost()).thenReturn(750.0);
		
		assertEquals(750.0, toTest.getCostForRepair(RepairType.ENGINE));
	}
	

	@Test
	void getRepairCost_windowRepairType_throwsUnsupportedException() {		
		assertThrows(IllegalStateException.class, () -> toTest.getCostForRepair(RepairType.WINDOW));
	}
}
