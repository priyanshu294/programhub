package Traffics;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

@SuppressWarnings("deprecation")
public class ETraffics extends Applet implements Runnable,ActionListener
{
	private static final long serialVersionUID = 1L;

	Graphics g;
	java.awt.Image iml,imr,imt,imb,buil;
	Button b1;
	
	Thread tt;
    
	
	@SuppressWarnings("deprecation")
	public void init()
	{
		
		iml=getImage(getCodeBase(),"carl.png");
		imr=getImage(getCodeBase(),"carr.png");
		imt=getImage(getCodeBase(),"cart.png");
		imb=getImage(getCodeBase(),"carb.png");
		
		
		
		b1=new Button("START");
		b1.addActionListener(this);
		add(b1);
		setVisible(true);
		setSize(1600,1000);
		setBackground(Color.ORANGE);
		
	}
	public void paint(Graphics g)
	{	
		g.setColor(Color.GRAY);
	    g.fillRect(0,300,1600,200);
	    g.fillRect(600,0,250,800);
	    
	   //dotted line
		g.setColor(Color.WHITE);
		int i=0;
		while(i<600)
		{
		g.drawLine(i,400,i+10,400);
		i+=20;
		}
		i=0;
		
		while(i<310)
		{
			g.drawLine(720,i,720,i+10);
			i+=20;
		}
		i=500;
		while(i<800)
		{
			g.drawLine(720,i,720,i+10);
			i+=20;
		}
		
		i=850;
		while(i<1600)
		{
		g.drawLine(i,400,i+10,400);
		i+=20;
		}
		
		g.drawImage(imr,20,320,this);
		g.drawImage(iml,1150,420,this);
		g.drawImage(imt,720,30,this);
		g.drawImage(imb,610,600,this);
	}
	public void runright()
	{
		g=getGraphics();
		
		g.setColor(Color.GREEN);
		g.fillRoundRect(560,300,50,100,10,10);
		g.setColor(Color.YELLOW);
		g.fillRoundRect(720,250,130,50,10,10);
		g.setColor(Color.RED);
		g.fillRoundRect(850,400,50,100,10,10);
		g.fillRoundRect(600,500,120,50,10,10);
		g.setColor(Color.GRAY);
		
		for(int j=20;j<2000;j++)
		{
		
		g.drawImage(imr,0+j,320,140,50,this);
	    g.drawRect(j,320,140,50);
	    
	    try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}
	
	public void runleft()
	{
		g=getGraphics();
		
		g.setColor(Color.GREEN);
		g.fillRoundRect(850,400,50,100,10,10);
		g.setColor(Color.YELLOW);
		g.fillRoundRect(600,500,120,50,10,10);
		g.setColor(Color.RED);
		g.fillRoundRect(560,300,50,100,10,10);
		g.fillRoundRect(720,250,130,50,10,10);
		g.setColor(Color.GRAY);
		
		for(int k=1150;k>-200;k--)
		{
		g.drawImage(iml,k,420,140,50,this);
		g.drawRect(k,420,140,50);
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}
	
	public void runtop()
	{
		g=getGraphics();
		
		g.setColor(Color.GREEN);
		g.fillRoundRect(600,500,120,50,10,10);
		g.setColor(Color.YELLOW);
		g.fillRoundRect(560,300,50,100,10,10);
		g.setColor(Color.RED);
		g.fillRoundRect(720,250,130,50,10,10);
		g.fillRoundRect(850,400,50,100,10,10);
		g.setColor(Color.GRAY);
		for(int i=600;i>-200;i--)
		{
		g.drawImage(imb,610,i,100,85,this);
		g.drawRect(610,i,100,85);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
	public void runbottom()
	{
		g=getGraphics();
		
		g.setColor(Color.GREEN);
		g.fillRoundRect(720,250,130,50,10,10);
		g.setColor(Color.RED);
		g.fillRoundRect(600,500,120,50,10,10);
		g.fillRoundRect(560,300,50,100,10,10);
		g.setColor(Color.YELLOW);
		g.fillRoundRect(850,400,50,100,10,10);
		g.setColor(Color.GRAY);
		for(int i=30;i<1200;i++)
		{
		g.drawImage(imt,720,0+i,100,65,this);
		g.drawRect(720,i,100,65);
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}


   @Override
   public void run() 
   {
	   while(true)
	   {
		   repaint();
		  
		   try{   
			   Thread.sleep(300);
		   }
		   catch(InterruptedException ie)
		   {			   
		   }
		   runtop();
		   repaint();
           try
           {
		    Thread.sleep(300);
		   }
		   catch(InterruptedException ie)
		   {   
		   }
           runright();
           repaint();
           
           try
           {   
		    Thread.sleep(300);
		   }
		   catch(InterruptedException ie)
		   {	   
		   }
           runbottom();
           repaint();
           
           try
           {   
		    Thread.sleep(300);
		   }
		   catch(InterruptedException ie)
		   {	   
		   }
           runleft();
	   }
   }
   @Override
   public void actionPerformed(ActionEvent ae) 
   {
	   tt=new Thread(this);
	   tt.start();
	   
	  if((ae.getSource()==b1) && tt==null)
	   {
	   repaint();
	   }
	   try 
	   {
		Thread.sleep(2000);
	   }
	   catch (InterruptedException e) 
	   {
		e.printStackTrace();
	   }   
   }

}

/*<applet code="ETraffics"
width=1200
height=800 >
</applet>
*/

