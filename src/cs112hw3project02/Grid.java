package cs112hw3project02;

public class Grid 
{
	// declare the variables.
	private char[][] grid;
	private int dimensions;
		
	// initialize the variables.
	public Grid() 
	{
		dimensions = 50;
		grid = new char[dimensions][dimensions];
		
		// initialize it to blank char
		for(int i = 0 ; i < dimensions ; i++)
		{			
			grid[i][0] = ' ';
			grid[0][i] = ' ';
		}
		
		for(int j = 0 ; j < dimensions ; j++)
		{
			grid[0][j] = ' ';
			grid[j][0] = ' ';	
		}
	}
	
	// draw rectangle
	public void drawRectangle(Rectangle rect) 
	{
		// size of the rectangle
		int width = rect.getWidth();
		int length = rect.getLength();
		
		// positions of the rectangle
		int x = rect.getX();
		int y = rect.getY();
		
		// left and right side of the rectangle
		for(int i = y ; i < length + y ; i++)
		{	 
			// left side
			grid[i][x] = '*';
			
			// right side
			grid[i][width - 1 + x] = '*';
		}
		
		// top and bottom of the rectangle
		for(int j = x ; j < width + x; j++)
		{
			// top 
			grid[y][j] = '*';
			
			// bottom
			grid[length - 1 + y][j] = '*';	
		}
	}
	
	public void drawTriangle(Triangle tri)
	{
		int aSide = tri.getSide();
		int x = tri.getX();
		int y = tri.getY();
		
		for(int i = 0 ; i < aSide; i++)
		{
			// left 
			grid[i+y][x] = '*';
			
			// right or hypotenuse
			grid[i+y][i+x] = '*';

		}
		
		for(int j = x ; j < aSide + x; j++)
		{
			// bottom of the triangle
			grid[aSide - 1 + y][j] = '*';

		}		
	}

	public char[][] getGrid()
	{
		return grid;
	}	
	public int getDimensions()
	{
		return dimensions;
	}
	
	// Create method that sets a 
	// new coordinates of the rectangle.
	public void reCenter(int newX, int newY)
	{	
		
	}

	public void display() {
		for(char[] r : this.grid) {
			for(char c : r) {
				System.out.print(c);
			}
			System.out.println(" ");
		}
	}
}