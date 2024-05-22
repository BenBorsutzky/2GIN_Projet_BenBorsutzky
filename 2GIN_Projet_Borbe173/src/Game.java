
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
public class Game {

    private Ball ball;
    private Circle circle;
    private boolean isGameOver;
    private int radius = 70; 
    
    //set the Ball and Circle at the start of the game
    public Game(Ball pBall, Circle pCircle){
        this.ball = pBall;
        this.circle = pCircle;
        
    }
    
    //initalize the ball and circle if none exists
    public void start(int width, int height){
        if(this.ball ==null){
            Ball ball = new Ball(width/2,height/2);
        }
        if(this.circle == null){
            Circle circle = new Circle(width/2, height/2);
        }
        ball.move(width/2,height/2,radius);
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
    public void isGameOver(){
        
    }
    
    //draw the circle and the ball
    public void draw(Graphics g, int width, int height){
        circle.draw(g);
        ball.draw(g);
    }
}
