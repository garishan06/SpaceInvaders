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
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author gari2
 */
public class SpaceShip {
    int x;
    int y;
    int width = 50;
    int height = 45;
    int speed = 3;
    int dx;
    
    int liveCount;
    Image image;
    public SpaceShip (int starting_x, int starting_y){
        this.x = starting_x;
        this.y = starting_y;
         this.dx = 0;
        liveCount = 3;
        
        
          try{ //We need to use this to catch for if the file is present in Files
       this.image = ImageIO.read(new File("spaceship.png"));
   } catch (IOException e){ //This will check if the file is there and if it isn't then this code will run instead.
   System.out.println("File not Found");
   }
        
    }
    
    public void draw(Graphics2D g2){
    
       
        g2.drawImage(this.image,this.x,this.y,this.width,this.height, null);    //beta spaceship drawing
        
        
        //draws spaceship's boundaries
     //   g2.setColor(Color.cyan);
       // g2.setStroke(new BasicStroke(1));
        //g2.draw(getBounds());
    
    }
    
    public void move(int dx){
    this.dx = dx;
    
    this.x= this.x + this.speed * this.dx;
    
    if ((this.x < 0 - this.width) && (this.dx == -1)){
    this.x = 800;
    
    } else  if ((this.x > 800) && (this.dx == 1)){
    this.x = 0;
    
    }
    
    
    } // end of move
    
    public void updateSpeed(int waveCount){
    if (waveCount % 3 == 0){ // the speed will increase every three waves
    speed+= (speed == 5) ? 0 : 1;   // if the speed is five then it will not increase anymore
       
    
    }
    
    
    }
    
    public Rectangle getBounds () {
          Rectangle bounds = new Rectangle(this.x,this.y, this.width, this.height);
          return bounds;
        }
    
}
