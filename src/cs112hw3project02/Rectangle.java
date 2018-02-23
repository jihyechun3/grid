package cs112hw3project02;

// Create a 'Rectangle' class thats derived from 
// 'Figure' class
public class Rectangle extends Figure
{
	// Create instance variables 
	private int length;
	private int width;
	private int x;
	private int y;
	
	// Constructor for the instance variables.
	public Rectangle(int aLength , int aWidth
			,int theX, int theY)
	{
		x = theX;
		y = theY;
		length = aLength;
		width = aWidth;		
	}
	
	// mutator and accessor methods for
	// rectangle x coordinate.
	public void setX(int newX)
	{
		x = newX;
	}
	public int getX()
	{
		return x;
	}
	
	// mutator and accessor for  
	// rectangle coordinate y
	public void setY(int newY)
	{
		x = newY;
	}
	public int getY()
	{
		return y;
	}
	
	// mutator & accessor for size of the
	// rectangle method.
	public void setLength(int newLength)
	{
		length = newLength;
	}
	public int getLength()
	{
		return length;
	}
	
	// mutator & acccessor for width method.
	public void setWidth(int newWidth)
	{
		length = newWidth;
	}
	public int getWidth()
	{
		return width;
	}
	
	// Create method that draws a 
	// rectangle figure.
	public void draw()
	{
		// top of the rectangle
		for(int i = 0; i < width ; i++)
		{
			System.out.print("*");
			
		}
		System.out.println("");
		 
		// left side of the rect
		for(int j = 0; j < length  ; j++)
		{
			System.out.print("*");
			
			for(int k = 0; k < length -2 ; k++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
	
		}
		
		for(int i = 0; i < width ; i++)
		{
			System.out.print("*");
		}
		System.out.println("");
			
	}
	
	// Create erase method that
	// erase the figure.
	public void erase()
	{
		for(int i = 0; i < 10 ; i++)
		{
			System.out.println();
		}
	}
	
	public void center()
	{
		erase();
	}
	
	public String toString()
	{
		return "This is Rectangle class.";
	}

	public boolean equals() 
	{
		return true;
	}			
	

}
