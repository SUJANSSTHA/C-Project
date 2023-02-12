import java.applet.Applet;
import java.awt.*;
import java.applet.*;

public class AnimationExample extends Applet {
    public static void main(String[] args) {
        
    
     void paint(Graphics g)
    {
        int x=150,y=150,a=10,b=10;
        for(int i=0;i<15;i++)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e)
            {

            }
            g.drawOval(x,y,a,b);
            x-=10;
            y-=10;
            a+=8;
            b+=8;
        }
    }
}
    
}
