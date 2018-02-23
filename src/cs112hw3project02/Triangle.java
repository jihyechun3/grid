package cs112hw3project02;


public class Triangle extends Figure
{
	// Declare instance variables.
	private int aSide;
	private int x;
	private int y;

	public Triangle(int aSide,  int newX, int newY)
	{
		this.aSide = aSide;
		x = newX;
		y = newY;	
	}
	
	// mutator and accessor method for
	// the side of the triangle figure.
	public void setSide(int newSide)
	{
		aSide = newSide;
	}
	public int getSide()
	{
		return aSide;
	}
	
	public void setX(int newX)
	{
		x = newX;
	}
	public int getX()
	{
		return x;
	}
	
	public void setY(int newY)
	{
		y = newY;
	}
	public int getY()
	{
		return y;
	}
	
	// draw the triangle figure
	public void draw()
	{
		// base line of the triangle.
		for(int j = 0; j <= aSide ; j++)
		{
			// subtracting the side length
			// to make a triangle figure.
			int m = aSide - j;

			// left side 
			System.out.print("+");
				
			// changing the size of gap
			for(int h = 0; h < aSide - m ; h++)
			{
				System.out.print("  ");
			}
			
			// right side
			System.out.println("+");
			}
		
		for(int j = 0; j < aSide ; j++)
		{
			System.out.print("+");
			System.out.print("  ");
		}		
	}
	
	// create erase method
	public void erase()
	{
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println();	
		}
	}
	
	// create center method
	public void center()
	{
		erase();
	}
	
	// Create toString method
	public String toString()
	{
		return "'toString' method has been invoked.";
	}
	
	// equals methods
	public boolean equals() 
	{
		return true;
	}
			
}
