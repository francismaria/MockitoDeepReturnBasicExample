package repair.service.engine;

import repair.service.CostService;

public class EngineCostService implements CostService {

	@Override
	public double getRepairCost() {
		return 1000.50;
	}

}
