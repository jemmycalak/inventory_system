/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.awt.Color;
import java.awt.Font;


/**
 *
 * 
 */
public class button  extends usu.widget.ButtonGlass{
    public button(){
    super();
    setFont(getFont().deriveFont(Font.BOLD));
    setForeground(Color.BLACK);
    setRoundRect(true);
    }
}
