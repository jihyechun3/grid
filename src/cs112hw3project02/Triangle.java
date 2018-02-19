package cs112hw3project02;

public class Triangle extends Figure
{
	private int aSide;
	
	public Triangle(int aSide)
	{
		this.aSide = aSide;
	}
	
	public void setSide(int newSide)
	{
		aSide = newSide;
	}
	
	public int getSide()
	{
		return aSide;
	}
	
	public void draw()
	{
		// base line of the triangle.
		for(int j = 0; j <= aSide ; j++)
		{
			// subtracting the side length
			// to make a triangle figure.
			int m = aSide - j;
	
			//for(int k = 0 ; k <= aSide - m  ; k++)
			//{
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
	//}
	
	public void erase()
	{
		for(int i = 0 ; i < 10 ; i++)
		{
			System.out.println();	
		}
	}
		
	public void center()
	{
		System.out.println("");
				
		draw();
		erase();
	}
			
	public String toString()
	{
		return "'toString' method has been invoked.";
	}

	public boolean equals() 
	{
		return true;
	}
			
}
