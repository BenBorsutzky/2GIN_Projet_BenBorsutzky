
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
    private int angle;
    private Color color;
    
    public Circle(int pX, int pY){
        this.x = pX;
        this.y = pY;
    }
    
    public void draw(Graphics g){
        //oben rechts
        g.setColor(color);
        g.drawArc(x+width/2, y+height/2, width/2, height/2,0, 90);
    }
}
