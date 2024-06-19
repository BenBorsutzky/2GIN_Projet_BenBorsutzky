package View;



import View.Background;
import java.awt.Color;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BorBe173
 */
public class GrayBackground extends Background {
    
    //draw the background of the game with the color gray
    @Override
    public void draw(Graphics g, int widht, int height) {
        g.setColor(Color.gray);
        g.fillRect(0, 0, widht, height);
    }
}
