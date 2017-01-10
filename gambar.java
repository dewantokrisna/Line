/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lingkaran;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author CHhannZ
 */
public class gambar extends JPanel {
    private int xc,yc,r;

    public int getxc() {
        return xc;
    }

    public int getyc() {
        return yc;
    }

    public int getr() {
        return r;
    }

    public void setxc(int xa) {
        xc = xa;
    }

    public void setyc(int ya) {
        yc = ya;
    }

    
    public void setr(int jari2) {
        r = jari2;
    }

    public void paint(Graphics g) {     
        int p =  1-r;
        int x = 0;
        int y = r;

        super.paint(g);
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.red);

        while(x<=y) {
            x++;
            if (p<0) {
               p+=2*x+1;
            } else {
                y--;
                p+=2*(x-y)+1;
            }
            
            g.drawRect(xc+x, yc+y, 1, 1);
            g.drawRect(xc-x, yc+y, 1, 1);
            g.drawRect(xc+x, yc-y, 1, 1);
            g.drawRect(xc-x, yc-y, 1, 1);
            g.drawRect(xc+y, yc+x, 1, 1);
            g.drawRect(xc-y, yc+x, 1, 1);
            g.drawRect(xc+y, yc-x, 1, 1);
            g.drawRect(xc-y, yc-x, 1, 1);
        }
        
    }
}
