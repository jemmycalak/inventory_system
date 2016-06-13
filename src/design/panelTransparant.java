/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;
import java.awt.geom.RoundRectangle2D.Double;

/**
 *
 * 
 */
public class panelTransparant extends JPanel {
    private Color warna;
    private GradientPaint paint;
    private Double shape;
    
    public panelTransparant(){
        setOpaque(false);
        warna=new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 80);
    }
    
    @Override
    public void setBackground(Color bg){
        super.setBackground(bg);
        warna=new Color(getBackground().getRed(), getBackground().getGreen(), getBackground().getBlue(), 80);
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    
        Graphics2D gd=(Graphics2D)g.create();
    
        gd.setColor(warna);
        shape=new RoundRectangle2D.Double(0,0, getWidth(), getHeight(), 10, 10);
        gd.fill(shape);
        gd.dispose();
    }
    
    
}
