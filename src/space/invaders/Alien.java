/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package space.invaders;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author gari2
 */
public class Alien {
    
    int x; // x position
    int y; // y position
    int rowSize; // controls the maximum amount of aliens per row
   
    int width; 
    int height; 
    int moveX = 30; // controls how much pixels the aliens move to the left/right everytime the move method is called
    int moveY = 30; // controls how much pixels the aliens move down everytime the the aliens reach the edge
    
    
    int alienType;
   
    //these dictate the alien's direction
    int dx; 
    int dy;
    
    int movetimer; //this counts how many times the move method is called within the timer in frmGame 
    int delay; // this controls how long the delay is before the aliens can move
    
    //these two variables will represent the maximum x and y values the aliens can reach
    int minX;
    int minY;
    
    //these two variables will represent the maximum x and y values the aliens can reach
    int maxX;
    int maxY;
    Image image;
    
    
    public Alien ( int starting_x, int starting_y, int type, Image img1, Image img2, Image img3){
        //constructor code. Each alien made will start with these values.
        this.x = starting_x;
        this.y = starting_y;
        this.moveX = 20; 
        
        this.alienType = type;
        
        switch (this.alienType){
            case 1:
                this.image = img1;
                this.width = 40;
                this.height = 35;
                break;
                
                
            case 2:
                this.image = img2;
                this.width = 50;
                this.height = 35;
                break;
                
            case 3:
                this.image = img2;
                this.width = 50;
                this.height = 35;
                break;
            case 4:
                this.image = img3;
                this.width = 50;
                this.height = 35;
                break;
            case 5:
                this.image = img3;
                this.width = 50;
                this.height = 35;
                break;
                
        
        } 
        
    }
    
    
    
 
    
    public void draw (Graphics2D g2){
    //draws the alien
    
    
             g2.drawImage(this.image,this.x,this.y, this.width,this.height,null); // beta alien
    
    }
    
    public void move(int dx, int dy, boolean goingDown){
    this.dx = dx;
    this.dy = dy;
    //move code
    if (goingDown){ // if the aliens reached their maximum/minimum x position, then they will move down first before continuing to move left or right
    this.y += this.moveY * this.dy;
    
    } else {
    this.x += this.moveX * this.dx;
    }   
      }
      
      public Rectangle getBounds () {
          // this method gets the boundaries of the alien
          
          Rectangle bounds = new Rectangle(this.x,this.y, this.width, this.height);
          return bounds;
        }

}
