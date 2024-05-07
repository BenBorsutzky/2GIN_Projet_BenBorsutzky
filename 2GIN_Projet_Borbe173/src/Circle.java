
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
public class Circle {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private int radius = 30;
    private int angle;
    
    public Circle(int pX, int pY){
        this.x = pX;
        this.y = pY;
    }
    
    public void draw(Graphics g){
        g.setColor(color);
        g.drawArc(x-radius, y-radius, radius*2, radius*2,0+angle, 90);
        g.drawArc(x-radius, y-radius, radius*2, radius*2,90+angle, 90);
        g.drawArc(x-radius, y-radius, radius*2, radius*2,180+angle, 90);
        g.drawArc(x-radius, y-radius, radius*2, radius*2,270+angle, 90);
    }
    
    public void moveLeft(){
        angle = angle + 30;
    }
    
    public void moveRight(){
        angle= angle -30;
    }
}
