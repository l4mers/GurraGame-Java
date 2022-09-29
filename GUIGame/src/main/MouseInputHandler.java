package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInputHandler implements MouseListener {

    GamePanel gamePanel;

    public MouseInputHandler(GamePanel gamePanel){
        this.gamePanel = gamePanel;

    }
    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println(e.getX() + " " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
