/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package space.invaders;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author gari2
 */
public class UFO {
    int x;
    int y;
    Image image;
    int speed;
    int width;
    int height;
    
    public UFO (int starting_x, int starting_y, Image image){
    this.x = starting_x; 
    this.y = starting_y; 
    this.image = image;
    this.speed = 3;
    this.width = 60;
    this.height = 30;
    
    }
    
    public void move (){
    this.x -= this.speed;
    }
    
    public void draw(Graphics2D g2){
    g2.drawImage(this.image,this.x,this.y,this.width,this.height,null);
    
    }
    
    public Rectangle getBounds(){
    Rectangle bounds = new Rectangle(this.x,this.y, this.width,this.height);
    
    return bounds;
    }
}
