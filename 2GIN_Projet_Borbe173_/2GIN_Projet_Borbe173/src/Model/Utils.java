package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sabine
 */
public class Utils {
    //class to get a random number of min and max
    public static int random(int min, int max){
        return (int)(Math.random()*(max-min+1))+min;
    }
}
