
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
public class Ball {
    private int x; // center of the ball x
    private int y; // center of the ball y
    private double xDir; // ball direction x
    private double yDir; // ball direction y
    private int radius = 7; // radius of the ball
    ArrayList <Color> alColors = new ArrayList<>(); // List with 4 lists --> randomized
    
    //set x and y of the ball
    public Ball(int pX, int pY, int pR){
        this.x = pX;
        this.y = pY;
        this.radius = pR;
        this.xDir = 2;
        this.yDir = 0;
    }
    
    
    //moves the ball
    public void move(int circleX,int circleY,int circleRadius){
        
        double distance = Math.sqrt(Math.pow(x-circleX, 2)+ Math.pow(y-circleY,2));        
        if(distance>=circleRadius-radius){
            xDir = -xDir;
            yDir = -yDir;
            
        }
        y = y+(int)yDir;
        x = x +(int)xDir;
        
    
    }
    
    //draw the ball, x and y = center of thef ball
    public void draw(Graphics g){
        Color random = randomColor();
        g.setColor(random);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
    
    //method to get a random color from the ArrayList
    public Color randomColor(){
        
        alColors.add(Color.cyan);
        alColors.add(Color.green);
        alColors.add(Color.magenta);
        alColors.add(Color.orange);
        
        int index = (int) (Math.random() * alColors.size());
        
        return alColors.get(index);     
    }
    
}

