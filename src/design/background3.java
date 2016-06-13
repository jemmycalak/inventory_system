/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * 
 */
public class background3 extends JPanel {
    private Image a;
    
    public background3(){
    setOpaque(true);
    a=new ImageIcon(getClass().getResource("/images/bg33.png")).getImage();

    }
    @Override
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D gd=(Graphics2D)g.create();
    gd.drawImage(a, 0,0,getWidth(), getHeight(), null);
    gd.dispose();
    }
}
