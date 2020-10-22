package kurs_3_Task_18.unitService;

import kurs_3_Task_18.units.Unit;
import kurs_3_Task_18.units.UnitType;

import java.util.HashMap;
import java.util.Map;

public class ActionService {
    private Map<UnitType, UnitAction> action = new HashMap<>();

    public ActionService() {
        action.put(UnitType.FOOTMAN, new FootmanAction());
        action.put(UnitType.CAVALRY, new CavalryAction());
        action.put(UnitType.WINGED, new WingedAction());
    }

    public void attack(Unit attacker, Unit enemy) {
        action.get(attacker.getType()).attack(enemy);
    }

    public void move(Unit unit) {
        action.get(unit.getType()).move();
    }
}
