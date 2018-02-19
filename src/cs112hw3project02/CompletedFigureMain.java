package cs112hw3project02;

public class CompletedFigureMain 
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle(3,5);
		//Triangle tri = new Triangle(6);
		Grid grid = new Grid();
		
		grid.drawRectangle(rect);
		grid.display();
		//rect.draw();
		
		grid.getDimensions();
		
		Figure newRectangle = new Rectangle(6,6);
		newRectangle.draw();
		
		Figure newTriangle = new Triangle(6);
		newTriangle.draw();

		
	}

}
