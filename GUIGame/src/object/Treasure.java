package object;

import entity.Entity;
import main.GamePanel;

public class Treasure extends Entity {


    public Treasure(GamePanel gamePanel) {

        super(gamePanel);

        name = "treasure";

        restSouth = setUp("/objects/treasure", gamePanel.tileSize, gamePanel.tileSize);

    }
}
