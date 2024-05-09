
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
    private int gameWidth;
    private int gameHeight;
    private Ball ball;
    private Circle circle;
    private boolean isGameOver;
    
    //set the Ball and Circle at the start of the game
    public Game(Ball pBall, Circle pCircle){
        
    }
    
    //initalize the ball and circle if none exists
    private void start(int width, int height){
        
    }
    
    //checks if the left or the right button is pushed /rotate left or right
    public void move(int mouseLeft, int mouseRight){
        
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
