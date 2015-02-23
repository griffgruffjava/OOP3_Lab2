import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class PacmanDriver extends JFrame implements ActionListener
{
	private JButton loseLife;
	private JButton query;
	private JTextArea textArea;
	private Container cpane;
	private PacmanPlayer pacman;
	
	
	public PacmanDriver()
	{
		setTitle("Pacman");
		setSize(300,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		loseLife = new JButton("Lose Life");
		loseLife.addActionListener(this);
		query = new JButton("Player Status");
		query.addActionListener(this);
		
		textArea = new JTextArea(50,125);
		cpane = getContentPane();
		cpane.setLayout(new FlowLayout());
		cpane.add(loseLife);
		cpane.add(query);
		pacman = new PacmanPlayer();
		
		
	}//end constructor
	
	public static void main(String args[])
	{
		PacmanDriver pd = new PacmanDriver();
		pd.setVisible(true);
		
	}//end main
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Lose Life"))
		{
			pacman.loseALife();
			if(pacman.getLives()>0)
			{
				JOptionPane.showMessageDialog(null, "Pacman has lost a life");
			}
			else if(pacman.getLives()==0)
			{
				JOptionPane.showMessageDialog(null, "Pacman has lost his last life");
				System.exit(0);
			}
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, pacman.toString());
		}
	}
	
	
	
	
	
	
	
	
	
}










