
public class PacmanPlayer extends Player
 {
	private int lives;

	public PacmanPlayer()
	{
		this(3);
	
	}
	
	public PacmanPlayer(int lives)
	{
		setLives(lives);
	}
	
	public void setLives(int lives)
	{
		this.lives=lives;
	}
	
	public int getLives()
	{
		return lives;
	}
	
	public void loseALife()
	{
		setLives(getLives()-1);
	}
	
	public boolean isDead()
	{
		if(getLives()<1)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		String output="Pacman has " + lives + " lives left";
		return output;
		
	}
	
	
	
	
}
