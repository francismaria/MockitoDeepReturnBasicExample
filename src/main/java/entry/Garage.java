package entry;

import repair.service.engine.EngineService;
import repair.service.tire.TireService;

public class Garage {
	
	private final TireService tireService;
	private final EngineService engineService;
	
	public Garage(TireService tireService, EngineService engineService) {
		this.tireService = tireService;
		this.engineService = engineService;
	}
	
	public double getCostForRepair(RepairType repairType) {
		switch(repairType) {
		case TIRE:
			return tireService.getRepairCost();
		case ENGINE:
			return engineService.getRepairCost();
		default:
			throw new IllegalStateException(String.format("Garage is not yet ready to support repairs of type: %s.", repairType));
		}
	}
}
