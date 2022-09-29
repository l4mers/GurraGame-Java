package object;

import entity.Entity;
import main.GamePanel;

public class Key extends Entity {


    public Key(GamePanel gamePanel) {

        super(gamePanel);

        name = "key";
        restSouth = setUp("/objects/key", gamePanel.tileSize, gamePanel.tileSize);

    }
}
