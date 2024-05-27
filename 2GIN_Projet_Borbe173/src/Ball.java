
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
    private boolean isHit= false;
    private Color ballColor; //current Color of the ball
    ArrayList <Color> alColors = new ArrayList<>(); // List with 4 lists --> randomized
    
    //set x and y of the ball
    public Ball(int pX, int pY, int pR){
        this.x = pX;
        this.y = pY;
        this.radius = pR;
        this.xDir = 1;
        this.yDir = 1;
        addColors();
        this.ballColor = randomColor();
    }
    
    
    //moves the ball
    public void move(int circleX,int circleY,int circleRadius, Circle circle){
        
        double distance = Math.sqrt(Math.pow(x-circleX, 2)+ Math.pow(y-circleY,2));        
        if(distance>=circleRadius-radius){
            xDir = -xDir;
            yDir = -yDir;
            isHit=true;
            if(!isColorMatching(circle)){
                System.out.println("Color is false");
            }
            
        }
        y = y+(int)yDir;
        x = x +(int)xDir;
        
    
    }
    
    
    //draw the ball, x and y = center of thef ball
    public void draw(Graphics g){
        if(isHit){
            ballColor = randomColor();
            isHit = false;
        }
        g.setColor(ballColor);
        g.fillOval(x-radius, y-radius, radius*2, radius*2);
    }
    
    //add the colors to the list
    public void addColors(){
        alColors.add(Color.cyan);
        alColors.add(Color.green);
        alColors.add(Color.magenta);
        alColors.add(Color.orange);
    }
    
    
    //method to get a random color from the ArrayList
    public Color randomColor(){
        int index = (int) (Math.random() * alColors.size());
        return alColors.get(index);     
    }
    
    //check if the color of the ball is the same than the circle color of the collision
    private boolean isColorMatching(Circle circle){
        //calculate the angle between the ball and the center of the circle in degrees
        int collisionAngle = (int)Math.toDegrees(Math.atan2(y-circle.getY(),x-circle.getX())) + 360;
        
        //check if the angle is between 0-360
        collisionAngle = collisionAngle % 360;
        
        //calculate the angle of the ball to the current angle of the circle-->shows the quarter
        int quarterAngle = (collisionAngle - circle.getAngle() + 360) %360;
        
        //Determines the quarter of the circle that the quarterangle hits (+3 = correction the the angle???)
        int quarter = (quarterAngle / 90 + 3) %4;
        
        //check if the ballcolor is the same than the quartercolor
        Color quarterColor = circle.getQuarterColor(quarter);
        return ballColor.equals(quarterColor);
    }
}

