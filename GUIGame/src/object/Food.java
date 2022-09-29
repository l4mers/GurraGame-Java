package object;

import entity.Entity;
import main.GamePanel;


public class Food extends Entity {


    public Food(GamePanel gamePanel) {
        super(gamePanel);

        name = "key";

        restSouth = setUp("/objects/food", gamePanel.tileSize, gamePanel.tileSize);

    }

}
