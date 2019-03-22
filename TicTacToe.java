//Bereket Mengiste
//bamengiste15@ole.augie.edu
//TicTacToe.java
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyJFrame extends JFrame implements ActionListener
{
		private JLabel lblTitle= new JLabel("Welcome To Beasts Game");
		private JPanel pnlNorth= new JPanel();
		
		private JButton[] btnClick; 
		private JPanel pnlCenter= new JPanel(); 
	
		private JLabel lblTime= new JLabel("");
		private JPanel pnlSouth=new JPanel();
		
		private int count=1;
		private long startTime;
		private long finishTime;
		private long totalTime;
		public MyJFrame()
		{
			btnClick= new JButton[9];
			for(int i=0; i<9; ++i)
				 btnClick[i]= new JButton("");
			add(pnlNorth, BorderLayout.NORTH);
			addControlsPnlNorth();
			
			add(pnlCenter, BorderLayout.CENTER);
			addControlsPnlCenter();
			
			add(pnlSouth, BorderLayout.SOUTH);
			addControlsPnlSouth();
			
			registerListener();
			startTime=System.currentTimeMillis();
		}
		public void addControlsPnlNorth()
		{
			pnlNorth.setLayout(new FlowLayout());
			pnlNorth.add(lblTitle);
		}
		public void addControlsPnlCenter()
		{
			pnlCenter.setLayout(new GridLayout(3,3));
			for(int i=0; i<9; ++i)
				pnlCenter.add(btnClick[i]);
		}
		public void addControlsPnlSouth()
		{
			pnlSouth.setLayout(new FlowLayout());
			pnlSouth.add(lblTime);
		}
		 
		public void registerListener()
		{
			for(int i=0; i<9; ++i)
				btnClick[i].addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e)
		{
	 
			if(count==1||count==3||count==5||count==7||count==9)
			{
				if(e.getSource()==btnClick[0])
				{
					btnClick[0].setText("X"); 
					btnClick[0].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[1])
				{
					btnClick[1].setText("X"); 
					btnClick[1].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[2])
				{
					btnClick[2].setText("X");
					btnClick[2].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[3])
				{
					btnClick[3].setText("X");
					btnClick[3].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[4])
				{
					btnClick[4].setText("X"); 
					btnClick[4].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[5])
				{
					btnClick[5].setText("X");
					btnClick[5].setFont(new Font("Serif",Font.BOLD,30)); 
				}
				else if(e.getSource()==btnClick[6])
				{
					btnClick[6].setText("X"); 
					btnClick[6].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[7])
				{
					btnClick[7].setText("X");
					btnClick[7].setFont(new Font("Serif",Font.BOLD,30));
				} 	
				else if(e.getSource()==btnClick[8])
				{
					btnClick[8].setText("X");
					btnClick[8].setFont(new Font("Serif",Font.BOLD,30));
				} 
			}
			else 
			{
				if(e.getSource()==btnClick[0])
				{
					btnClick[0].setText("O"); 
					btnClick[0].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[1])
				{
					btnClick[1].setText("O");
					btnClick[1].setFont(new Font("Serif",Font.BOLD,30));
				} 
				else if(e.getSource()==btnClick[2])
				{
					btnClick[2].setText("O");
					btnClick[2].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[3])
				{
					btnClick[3].setText("O");
					btnClick[3].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[4])
				{
					btnClick[4].setText("O"); 
					btnClick[4].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[5])
				{
					btnClick[5].setText("O"); 
					btnClick[5].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[6])
				{
					btnClick[6].setText("O"); 
					btnClick[6].setFont(new Font("Serif",Font.BOLD,30));
				}
				else if(e.getSource()==btnClick[7])
				{
					btnClick[7].setText("O"); 
					btnClick[7].setFont(new Font("Serif",Font.BOLD,30));
				}	
				else if(e.getSource()==btnClick[8])
				{
					btnClick[8].setText("O");
					btnClick[8].setFont(new Font("Serif",Font.BOLD,30));
				}
			}
			count++;
			whoWin();
		}
		public void whoWin()
		{	
			
			if(btnClick[0].getText()=="X"&btnClick[1].getText()=="X"&btnClick[2].getText()=="X"||
			   btnClick[3].getText()=="X"&btnClick[4].getText()=="X"&btnClick[5].getText()=="X"||
			   btnClick[6].getText()=="X"&btnClick[7].getText()=="X"&btnClick[8].getText()=="X"||
			   btnClick[0].getText()=="X"&btnClick[3].getText()=="X"&btnClick[6].getText()=="X"||
			   btnClick[1].getText()=="X"&btnClick[4].getText()=="X"&btnClick[7].getText()=="X"||
			   btnClick[0].getText()=="X"&btnClick[1].getText()=="X"&btnClick[2].getText()=="X"||
			   btnClick[2].getText()=="X"&btnClick[5].getText()=="X"&btnClick[8].getText()=="X"||
			   btnClick[0].getText()=="X"&btnClick[4].getText()=="X"&btnClick[8].getText()=="X"||
			   btnClick[2].getText()=="X"&btnClick[4].getText()=="X"&btnClick[6].getText()=="X")
			   {
			   		
			   		changeLblTitle(0);
			   		lblTitle.setForeground(Color.blue);
			   		for(int i=0;i<9; i++)
			   			btnClick[i].setEnabled(false);
			   		finishTime=System.currentTimeMillis();
			   		totalTime=(finishTime-startTime)/1000;
			   		lblTime.setText("Time taken: "+totalTime+" seconds");
			   		lblTime.setFont(new Font("",Font.PLAIN,12));
			   		
			   }
			else if
		      (btnClick[0].getText()=="O"&btnClick[1].getText()=="O"&btnClick[2].getText()=="O"||
			   btnClick[3].getText()=="O"&btnClick[4].getText()=="O"&btnClick[5].getText()=="O"||
			   btnClick[6].getText()=="O"&btnClick[7].getText()=="O"&btnClick[8].getText()=="O"||
			   btnClick[0].getText()=="O"&btnClick[3].getText()=="O"&btnClick[6].getText()=="O"||
			   btnClick[1].getText()=="O"&btnClick[4].getText()=="O"&btnClick[7].getText()=="O"||
			   btnClick[0].getText()=="O"&btnClick[1].getText()=="O"&btnClick[2].getText()=="O"||
			   btnClick[2].getText()=="O"&btnClick[5].getText()=="O"&btnClick[8].getText()=="O"||
			   btnClick[0].getText()=="O"&btnClick[4].getText()=="O"&btnClick[8].getText()=="O"||
			   btnClick[2].getText()=="O"&btnClick[4].getText()=="O"&btnClick[6].getText()=="O")
			   {
			   		changeLblTitle(1);
			   		lblTitle.setForeground(Color.blue);
			   		for(int i=0;i<9; i++)
			   			btnClick[i].setEnabled(false);
			   		finishTime=System.currentTimeMillis();
			   		totalTime=(finishTime-startTime)/1000;
			   		lblTime.setText("Time taken: "+totalTime+" seconds");
			   		lblTime.setFont(new Font("",Font.PLAIN,12));
			   }			
			
		}
		public void changeLblTitle(int num)
		{
			if (num==0)
				lblTitle.setText("Game Over! X wins!");
			else 
				lblTitle.setText("Game Over! O wins!");
		}
}
public class TicTacToe
{
	public static void main(String[] args)
   	{
		MyJFrame f=new MyJFrame();					
		f.setTitle("TicTacToe");			
		f.setSize(255,255);						
		f.setLocationRelativeTo(null);					
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		f.setVisible(true);							
	}
}