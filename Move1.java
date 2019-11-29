package priyanshu;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Move1 extends Applet implements Runnable,ActionListener
{
	Thread t;
	int x;
	Button b1,b2,b3,b4;

	@Override
	public void init()
{
	setBackground(Color.cyan);
	b1=new Button("Life");
	b2=new Button("Kill");
	b3=new Button("Pause");
	b4=new Button("Resume");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b1.setFont(new Font("Arial",Font.BOLD,20));
        b2.setFont(new Font("Arial",Font.BOLD,20));
	b3.setFont(new Font("Arial",Font.BOLD,20));
	b4.setFont(new Font("Arial",Font.BOLD,20));
	add(b1);
	add(b2);
	add(b3);
	add(b4);
}
	@Override
	public void actionPerformed(ActionEvent ae)
{
	Button bb=(Button)ae.getSource();
	if((bb==b1) && (t==null))
{
	t=new Thread(this);
	t.start();
}
else if((bb==b2) && (t!=null))
{
	t.stop();
	t=null;
}
else if((bb==b3) && (t!=null))
{
	t.suspend();
}
else if((bb==b4) && (t!=null))
{
	t.resume();
}
}
	@Override
	public void run()
{
	while(true)
{
	for(x=1;x<=getSize().width;x+=20)
{
	repaint();
try{
Thread.sleep(200);
}catch(InterruptedException ie)
	{
	}
}
}
}
	@Override
	public void paint(Graphics g)
{
	g.setColor(Color.blue);
	g.fillOval(x,200,80,80);
}
}
/*
<applet code="Move1" width=500 height=500>
</applet>
*/
	