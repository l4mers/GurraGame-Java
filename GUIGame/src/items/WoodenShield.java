package items;

import main.GamePanel;

public class WoodenShield extends Item{
    public WoodenShield(GamePanel gamePanel) {
        super(gamePanel);

        setDefaultValues();
        setIcon();
    }
    private void setDefaultValues(){
        name = "Wooden Shield";
        //requiredLevel = 1;
        //strengthValue = 1;
        //dexterityValue = 1;
        defenseValue = 1;
        //coinValue = 1;

        stackAble = false;

        toolTip = "ATTRIBUTE VALUES\nDefense: " + defenseValue;
    }
    private void setIcon(){
        icon = super.setUp("/items/wooden_shield", gamePanel.tileSize, gamePanel.tileSize);
    }
}
