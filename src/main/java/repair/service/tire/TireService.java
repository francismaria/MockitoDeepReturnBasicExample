package repair.service.tire;

import repair.service.CostService;
import repair.service.RepairService;

public class TireService implements RepairService {

	@Override
	public CostService createCostServiceInstance() {
		return new TireCostService();
	}
}
