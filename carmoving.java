import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class carmoving extends Applet implements ActionListener
{ 
int x; int y; int w;int t1,t2;
 Button b1;Button b2;Button b3;
 String msg=" ";
 void sleep()                 
 {
      try {
    Thread.sleep(25);
          }catch(Exception ex) {
      }
}
 public void init()

   {
 t1=0;t2=1;
 y=550;
 x=20;
 setLayout(new FlowLayout(FlowLayout.CENTER));
 Label l=new Label("JavaTC");
 b1=new Button("back");
 add(b1);
 b2=new Button("forward");
 b3=new Button("stop");
 add(b3);add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);
 }
 
public void start()
 {
 }
 public void actionPerformed(ActionEvent e)
 {
  String s=e.getActionCommand();
 if(s.equals("back"))
 {
  msg="back";
  repaint();
 }
 else if(s.equals("forward"))
    {
     msg="forward";
  repaint();
  }
 else if(s.equals("stop"))
  {
   msg="  ";repaint(); }
 }
public void paint(Graphics g)
 {
 setBackground(Color.blue);
       w=getWidth();
       Color c1=new Color(20,160,200);
       Color c2=new Color(200,60,200);
       g.setColor(c1);  

       g.fillRoundRect(x,y+20,100,40,5,5);
       g.fillArc(x+90,y+20,20,40,270,180);
       g.setColor(c1);  
       g.fillRoundRect(x+10,y,70,25,10,10);
       g.setColor(Color.white);

       g.fillRect(x+20,y+5,20,25);

       g.fillRect(x+50,y+5,20,25);
       g.setColor(Color.black);

       g.fillRoundRect(x+55,y+10,10,20,10,10);
       g.fillOval(x+10,y+50,25,25);

       g.fillOval(x+60,y+50,25,25);
       g.setColor(Color.white);
       g.fillArc(x+20,y+60,5,5,0,360);
    g.fillArc(x+70,y+60,5,5,0,360); 
g.setFont(new Font("Arial",Font.BOLD,36));
g.drawString("PRIYANSHU HUB",450,350);
g.drawLine(1050,450,970,540);
g.fillRect(1040,560,40,80);
g.setFont(new Font("Arial",Font.BOLD,18));
g.drawString("Java TC",1025,500);
g.drawLine(1050,450,1150,540);
g.setColor(Color.white);
g.drawRect(1000,520,125,120);
g.setColor(Color.red);
g.fillRect(1040,560,40,80);


    sleep();
    if(msg.equals("forward"))
  {          
  if(x+120<w)
   {
    x=x+1;
    showStatus("press back for moving backward");
    repaint();
   }
  }
    if(msg.equals("back"))
      {
       if(x>0)
    {
    x=x-1;
    showStatus("press forward for moving forward");
    repaint();}
      }
}
}
/*<applet code="carmoving" height=300 width=400>
</applet>*/
