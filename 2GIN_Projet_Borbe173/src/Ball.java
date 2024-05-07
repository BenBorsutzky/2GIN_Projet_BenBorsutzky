
import java.awt.Color;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Borsutzky
 */
public class Ball {
    private int x;
    private int y;
    private int xDir;
    private int yDir;
    private int radius;
    private Color color;
    
    public Ball(int pX, int pY, int pRadius){
        this.x = pX;
        this.y = pY;
        this.radius = pRadius;
    }
    
    public void isHit(int width, int height){
        if((y+radius+yDir>=height)||(y-radius+yDir<=0)){
            yDir = -yDir;
        }
        
        if((x+radius+xDir>=width)||(x-radius+xDir<=0)){
            xDir = -xDir;
        }
    }
    
    public void move(int width, int height){
        isHit(width, height);
        x = x+ xDir;
        y = y+ yDir;    
    }
    
    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
}
