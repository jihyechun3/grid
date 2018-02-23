/* CompletedFigure.java - 
 * 
 * Author :	JiHye Chun
 * Module : Module3
 * Project : Chapter8 / Problem #5
 * 
 * Description : 
 * Algorithm : 
 * 1. Create a grid object.
 * 2. Create a rectangle object with the 
 *    value of rectangle's information
 *    - length, width, (x,y) coordinates.
 * 3. Create a triangle object with the
 *    value of triangle's information.
 *    - one side length of triangle
 *    - (x,y) coordinate.
 * 4. Call a method for each class object 
 *    to printout the result of figures.
 *    - least of two rectangle figures.
 *    - least of two triangle figures.
 *    - least one of the rectangle with center
 *      method.
 *    - lease of the triangle with center 
 *      method.
 */
package cs112hw3project02;

public class CompletedFigureMain 
{
	public static void main(String[] args) 
	{
		Grid grid = new Grid();
		
		//length,width,x,y
		Rectangle rect = new Rectangle(10,10,20,20);
		Rectangle rect2 = new Rectangle(8,10,5,7);
		
		grid.drawRectangle(rect, '*');
		grid.reCenter(rect,10,10);

		grid.drawRectangle(rect2, '*');
	
		// side length, x,y
		Triangle tri = new Triangle(9,25,25);
		grid.drawTriangle(tri);
		grid.display();
		
		
		/**
		grid.getDimensions();
		
		Figure newRectangle = new Rectangle(5,5,20,20);
		newRectangle.draw();
		
		Figure newTriangle = new Triangle(6);
		newTriangle.draw();
		*/
		
	}

}
