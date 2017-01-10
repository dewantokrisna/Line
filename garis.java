/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dda;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CHHANNZ
 */
public class garis extends JPanel {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
   
    
    public int getx1() {
        return x1;
    }
    
    public int getx2() {
        return x2;
    }
    
    public int gety1() {
        return y1;
    }
    
    public int gety2() {
        return y2;
    }
    
    public void setx1(int xa) {
        x1 = xa;
    }
    
    public void setx2(int xb) {
        x2 = xb;
    }
    
    public void sety1(int ya) {
        y1 = ya;
    }
    
    public void sety2(int yb) {
        y2 = yb;
    }
    
       
    public void paint(Graphics g) {
        int dx = x2-x1;
        int dy = y2-y1;
        int steps,k; 

        float x=x1;
        float y=y1;
        float x_inc,y_inc;
        

        super.paint(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.RED);

        if(Math.abs(dx)>Math.abs(dy)) steps = Math.abs(dx);
        else steps = Math.abs(dy);

        x_inc = dx/(float)steps;
        y_inc = dy/(float)steps;

        g.drawRect(Math.round(x), Math.round(y), 1, 1);
        for(k=0;k<steps;k++) {
            x+=x_inc;
            y+=y_inc;
            g.drawRect(Math.round(x), Math.round(y), 1, 1);
        }

      
        
    }
    
    public garis() {
    
    }
}
