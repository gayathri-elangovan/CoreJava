package sample;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings({ "deprecation", "serial" })
public class traffic extends Applet implements ItemListener
{
	CheckboxGroup cbg;
	Checkbox op1,op2,op3;
	public void init()
	{
		setSize(1200,600);
		setBackground(Color.CYAN);
		cbg=new CheckboxGroup();
		op1=new Checkbox("red",false,cbg);
		op2=new Checkbox("yellow",false,cbg);
		op3=new Checkbox("green",false,cbg);
		add(op1);
		add(op2);
		add(op3);
		op1.addItemListener(this);
		op2.addItemListener(this);
		op3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawOval(600,50,100,100);
		g.drawOval(600,150,100,100);
		g.drawOval(600,250,100,100);
		if((cbg.getSelectedCheckbox().getLabel())=="red")
		{
			g.setColor(Color.red);
			g.fillOval(600,50,100,100);
		}
		if(cbg.getSelectedCheckbox().getLabel()=="yellow")
		{
			g.setColor(Color.yellow);
			g.fillOval(600,150,100,100);
		}
		if(cbg.getSelectedCheckbox().getLabel()=="green")
		{
			g.setColor(Color.green);
			g.fillOval(600,250,100,100);
		}
	}
}

