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
 * @author CALAK
 */
public class bg_login extends JPanel{
    private Image a;
    
    public bg_login(){
    setOpaque(true);
    a=new ImageIcon(getClass().getResource("/images/bg_Login.jpg")).getImage();

    }
    @Override
    protected void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D gd=(Graphics2D)g.create();
    gd.drawImage(a, 0,0,getWidth(), getHeight(), null);
    gd.dispose();
    }
    
}
