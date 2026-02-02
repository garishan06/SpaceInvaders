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
public class Barrier {
    
    
    int x;
    int y;
    int length;
    int thickness;
    int durability;
    
    public Barrier (int starting_x, int starting_y, int length, int thickness, int durability) {
    this.x = starting_x;
    this.y = starting_y;
    this.length = length;
    this.thickness = thickness;
    this.durability = durability;
    
    }
    
    public void draw(Graphics2D g2){
        g2.setColor (Color.RED);
        g2.fillRect(this.x, this.y, this.length, this.thickness);        
    }
    
    public Rectangle getBounds(){
    Rectangle bounds = new Rectangle(this.x, this.y,this.length,this.thickness);
    
    return bounds;
    }
}
