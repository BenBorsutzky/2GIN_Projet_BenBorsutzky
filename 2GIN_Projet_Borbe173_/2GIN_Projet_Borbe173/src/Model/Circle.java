package Model;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Borsutzky
 */
public class Circle {
    private int x; // center of the circle x
    private int y; // center of the circle y
    private int radius = 70; // radius of the circle
    private int angle; // angle of the circle to move left or right
    private ArrayList<Color> alColors = new ArrayList<>(); // list of the circle colors
    
    //set x, y, radius of the circle and the add the 4 colors to the list
    public Circle(int pX, int pY,int pR){
        this.x = pX;
        this.y = pY;
        this.radius = pR;
        alColors.add(Color.cyan);
        alColors.add(Color.green);
        alColors.add(Color.magenta);
        alColors.add(Color.orange);
    }
    
    
    //draw the 4 pieces of the circle from the list
    public void draw(Graphics g){
        for(int i = 0; i<alColors.size();i++){
            g.setColor(alColors.get(i));
            g.drawArc(x-radius, y-radius, radius*2, radius*2, angle+(i*90), 90);
        }
    }
    
    //Get the color of the quarter of the circle
    public Color getQuarterColor(int quater){
        return alColors.get(quater);
    }
    
    //rotate the circle to the left
    public void moveLeft(){
        angle = (angle + 40) %360;
    }
    
    //rotate the circle to the right
    public void moveRight(){
        angle= (angle -40 + 360) %360;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAngle() {
        return angle;
    }
    
    
    
}
