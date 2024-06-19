package Model;


import java.awt.Color;
import java.awt.Font;
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
public class Game {

    private Ball ball; // new Ball
    private Circle circle; // new Circle
    private int ballRadius = 7; //radius of the ball
    private int circleRadius = 70; //radius of the circle
    
    //set the Ball and Circle at the start of the game
    public Game(int width, int height){
        this.ball = new Ball(width/2, height/2, ballRadius);
        this.circle = new Circle(width/2, height/2, circleRadius);
        
    }
    
    //initalize the ball and circle if none exists
    public void start(int width, int height){
        if(this.ball ==null){
            Ball ball = new Ball(width/2,height/2,ballRadius);
        }
        if(this.circle == null){
            Circle circle = new Circle(width/2, height/2, circleRadius);
        }
        ball.move(width/2,height/2,circleRadius, circle);
        
    }
    
    //moves the circle to the right
    public void moveRight(){
        circle.moveRight();
    }
    
    //moves the circle to the left
    public void moveLeft(){
        circle.moveLeft();
    }
    
    //check if the game is finished // if no, the color of the ball change
    public boolean isGameOver(){
        if(ball.getIsGameOver()){
            return true;
        }
        return false;
        
    }
    
    //draw the circle and the ball
    public void draw(Graphics g, int width, int height){
        circle.draw(g);
        ball.draw(g);
        
        g.setColor(Color.white);
        Font oldFont = g.getFont();
        g.setFont(oldFont.deriveFont(20f));
        g.drawString("Score: "+ball.getScore(),width/2-32, height/10);
        g.setFont(oldFont);
        
    }
    
    //get the score, -1 because of the last collision
    public int getScore(){
        return ball.getScore()-1;
    }
    
    public Ball getBall(){
        return ball;
    }
    
}
