package constructor.dependency.injection;

public class PointConstructor {

	private int x, y;

	public PointConstructor(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	
	public String toString()
	{
		return x + " " + y;
 	}
	
}
