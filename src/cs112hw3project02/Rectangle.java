package cs112hw3project02;

public class Rectangle extends Figure
{
	private int length;
	private int width;
	
	public Rectangle(int aLength , int aWidth)
	{
		length = aLength;
		width = aWidth;
	}
	
	public void setLength(int newLength)
	{
		length = newLength;
	}
	public int getLength()
	{
		return length;
	}
	
	public void setWidth(int newWidth)
	{
		length = newWidth;
	}
	public int getWidth()
	{
		return width;
	}
	
	public void draw()
	{
		
		// top of the rectangle
		for(int i = 0; i < width ; i++)
		{
			System.out.print("*");
			
		}
		System.out.println("");
		 
		// left side of the rec
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
