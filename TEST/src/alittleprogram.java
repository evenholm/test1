	import javax.swing.*;

import java.awt.Container;
import java.awt.event.*;
public class alittleprogram extends JFrame implements ActionListner{
	
	public alittleprogram()
	  {
	     JButton b = new JButton("exit");
	     b.addActionListener((ActionListener) this);
	     Container cp = this.getContentPane();
	     cp.add(b);
	     this.setSize(200,200);
	     this.setVisible(true);
	  }
	  public void actionPerformed(ActionEvent evt)
	  {
	     System.exit(0);
	   }
	   public static void main(String[] args)
	  {
	      new alittleprogram();
	   }
	}

