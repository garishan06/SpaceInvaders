/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package space.invaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author gari2
 */
public class Missle {

    int x;
    int y;
    int speed;
     
    int type;
    
    public Missle(int starting_x, int starting_y, int missleType){
    //constructor code
        this.x = starting_x;
        this.y = starting_y;
       
        this.type = missleType;
     
        this.speed = (this.type == 1) ? 15 : 5; 
    }
    
    public void draw (Graphics2D g2){
    //draws the missle
        switch (this.type){
        case 1:
            g2.setColor(Color.YELLOW);
            g2.fillRect(this.x, this.y, 10, 20);
            break;
        case 2:
            g2.setColor(Color.WHITE);
            g2.fillRect(this.x, this.y, 10, 20);
        }
    }
    
    public Rectangle getBounds(){
        //gets the boundaries for the missle
    Rectangle bounds= new Rectangle (this.x,this.y,10,20);
    
    return bounds;
    }
    
    public void move(){
       switch(this.type){
           case 1:
               this.y-=this.speed;
               break;
               
           case 2: 
               this.y+= this.speed;
               break;
       }
    }
}
