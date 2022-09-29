package main;

import entity.MobileKnight;
import foe.MobileRedSlime;


public class AssetDealer {
    GamePanel gamePanel;

    public AssetDealer(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }
    public void setObject(){

    }
    public void setNPC(){
        gamePanel.npc[0] = new MobileKnight(gamePanel);
        gamePanel.npc[0].worldX = gamePanel.tileSize * 26;
        gamePanel.npc[0].worldY = gamePanel.tileSize * 24;

        gamePanel.npc[1] = new MobileKnight(gamePanel);
        gamePanel.npc[1].worldX = gamePanel.tileSize * 30;
        gamePanel.npc[1].worldY = gamePanel.tileSize * 30;
    }
    public void setFoe(){
        gamePanel.foe[0] = new MobileRedSlime(gamePanel);
        gamePanel.foe[0].worldX = gamePanel.tileSize * 20;
        gamePanel.foe[0].worldY = gamePanel.tileSize * 35;

        gamePanel.foe[1] = new MobileRedSlime(gamePanel);
        gamePanel.foe[1].worldX = gamePanel.tileSize * 21;
        gamePanel.foe[1].worldY = gamePanel.tileSize * 39;
    }
}
