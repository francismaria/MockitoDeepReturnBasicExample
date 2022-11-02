package repair.service.engine;

import repair.service.CostService;
import repair.service.RepairService;

public class EngineService implements RepairService {

	@Override
	public CostService createCostServiceInstance() {
		return new EngineCostService();
	}

}
