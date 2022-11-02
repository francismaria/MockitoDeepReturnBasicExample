package repair.service.tire;

import repair.service.CostService;

public class TireCostService implements CostService {

	@Override
	public double getRepairCost() {
		return 200.0;
	}

}
