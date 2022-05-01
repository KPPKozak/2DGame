package object;

import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperObject {
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;

    public void draw(Graphics2D graphics2D, GamePanel gamePanel){

        int screenX = worldX - gamePanel.player.worldX + gamePanel.player.screenX;
        int screenY = worldY - gamePanel.player.worldY + gamePanel.player.screenY;

        if(worldX + gamePanel.tileSize > gamePanel.player.worldX - gamePanel.player.screenX &&
                worldX - (2 * gamePanel.tileSize)  < gamePanel.player.worldX + gamePanel.player.screenX &&
                worldY + gamePanel.tileSize  > gamePanel.player.worldY - gamePanel.player.screenY &&
                worldY - (2 * gamePanel.tileSize) < gamePanel.player.worldY + gamePanel.player.screenY){
            graphics2D.drawImage(image, screenX, screenY, gamePanel.tileSize, gamePanel.tileSize, null);
        }

    }
}
