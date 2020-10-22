package kurs_3_Task_18.gameUtil;

import kurs_3_Task_18.gameUtil.Field;
import kurs_3_Task_18.playerUtil.Faction;
import kurs_3_Task_18.playerUtil.Player;
import kurs_3_Task_18.playerUtil.PlayerList;

import java.io.File;
import java.util.ArrayList;

public class Game {
    private ArrayList<String> names = new ArrayList<>();
    private Field gameField = new Field(new ArrayList<ArrayList<Field.Vertex>>());
    private PlayerList players = new PlayerList();
    private Player winner = null;

    private void readField(File fieldFile) {

    }

    public Game(ArrayList<String> names) {
        this.names = names;
        Faction[] f = new Faction[4];
        f[0] = Faction.RED;
        f[1] = Faction.BLUE;
        f[2] = Faction.GREEN;
        f[3] = Faction.PURPLE;
        int j = 0;
        for (int i = 0; i < names.size(); i++) {
            if(j == 4)
                j = 0;
            players.add(new Player(f[j], names.get(i), new File("army.txt")));
            j++;
        }
    }

    public void startGame() {

    }
}
