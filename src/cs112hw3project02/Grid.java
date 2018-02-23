/* Grid.java - 
 * 
 * Author : JiHye Chun
 * Module : Module 3
 * Project : Chapter8/project #5
 * Problem Statement : 
 * 
 * Algorithm :
 * 1. Create instance variables for 
 *    grid class.
 * 2. Create a constructor for the
 *    grid class and initialize the 
 *    instance variables.
 * 3. Create a method that draw 
 *    rectangles.
 * 4. Create a method that erase the
 *    rectangle figure.
 * 5. Create a method that draw 
 *    triangles.
 * 6.
 * 
 */

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
			for(int j = 0; j < dimensions; j++){
				grid[i][j] = ' ';
			}
		}
	}
	
	// draw rectangle
	public void drawRectangle(Rectangle rect, char drawingChar) 
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
			grid[i][x] = drawingChar;
			
			// right side
			grid[i][width - 1 + x] = drawingChar;
		}
		
		// top and bottom of the rectangle
		for(int j = x ; j < width + x; j++)
		{
			// top 
			grid[y][j] = drawingChar;
			
			// bottom
			grid[length - 1 + y][j] = drawingChar;	
		}
	}
	
	// erase rectangle method.
	public void eraseRectangle(Rectangle rect, char newChar)
	{
		this.drawRectangle(rect, ' ');
	}
	
	// Draw triangle method.
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
	// 
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
	public void reCenter(Rectangle rect, int newX, int newY)
	{
        this.eraseRectangle(rect,' ');

		rect.setX(newX);
		rect.setY(newY);

		this.drawRectangle(rect, '+');
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