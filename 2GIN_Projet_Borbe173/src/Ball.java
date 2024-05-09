
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
    private int xDir; // ball direction x
    private int yDir; // ball direction y
    private int radius = 15; // radius of the ball
    ArrayList <Color> alColors = new ArrayList<>(); // List with 4 lists --> randomized
    
    //Set x and y of the ball
    public Ball(int pX, int pY){
        this.x = pX;
        this.y = pY;
    }
    
    //Check if the ball hits the wall of the Circle (width, height = inside of the circle)
    public void isHit(int width, int height){
        if((y+radius+yDir>=height)||(y-radius+yDir<=0)){
            yDir = -yDir;
        }
        
        if((x+radius+xDir>=width)||(x-radius+xDir<=0)){
            xDir = -xDir;
        }
    }
    
    //moves the ball after the collision with the circle
    public void move(int width, int height){
        isHit(width, height);
        x = x+ xDir;
        y = y+ yDir;    
    }
    
    //draw the ball, x and y = center of the ball
    public void draw(Graphics g){
        g.setColor(randomColor());
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
    
    //method to get a random color from the ArrayList
    public Color randomColor(){
        
        alColors.add(Color.blue);
        alColors.add(Color.green);
        alColors.add(Color.pink);
        alColors.add(Color.orange);
        
        int index = (int) (Math.random() * alColors.size());
        
        return alColors.get(index);     
    }
    
}

