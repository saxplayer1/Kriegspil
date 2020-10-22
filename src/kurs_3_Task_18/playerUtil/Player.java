package kurs_3_Task_18.playerUtil;

import kurs_3_Task_18.units.Unit;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private Faction faction;
    private String name;
    private List<Unit> army = new ArrayList<>();

    public Player(Faction faction, String name, File armyList) {
        this.faction = faction;
        this.name = name;

    }

    public void makeTurn() {

    }
}
