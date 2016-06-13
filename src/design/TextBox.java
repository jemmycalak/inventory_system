/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import usu.util.StringUtil;
import usu.widget.glass.TextBoxGlass;
import usu.widget.text.DefaultDocument;

/**
 *
 * 
 */
public class TextBox extends TextBoxGlass{
    public TextBox(){
        super();
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.BLACK);
        setSelectionColor(Color.GREEN.brighter());
        setCaretColor(Color.white);
        setHorizontalAlignment(LEFT);
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e){
            selectAll();
            
            }
});
        setDocument(new DefaultDocument(){
            
            private static final long serialVersionUID= 1L;
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
                if(StringUtil.containQuote(str)){
                return;
            }
            super.insertString(offs, str, a);
            }
            });
        
    }
    
}
