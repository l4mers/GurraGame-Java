package items;

import main.GamePanel;

public class NormalSword extends Item{

    public NormalSword(GamePanel gamePanel) {
        super(gamePanel);

        setDefaultValues();
        setIcon();
    }
    private void setDefaultValues(){
        name = "Rusty Sword";
        //requiredLevel = 1;
        //strengthValue = 1;
        //dexterityValue = 1;
        attackValue = 1;
        //coinValue = 1;

        stackAble = false;

        toolTip = "ATTRIBUTE VALUES\nAttack +" + attackValue;
    }
    private void setIcon(){
        icon = super.setUp("/items/normal_sword", gamePanel.tileSize, gamePanel.tileSize);
    }
}
