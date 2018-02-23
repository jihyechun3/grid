package cs112hw3project02;

public class CompletedFigureMain 
{
	public static void main(String[] args) 
	{
		Grid grid = new Grid();
		
		//length,width,x,y
		Rectangle rect = new Rectangle(30,30,20,20);
		//Rectangle rect2 = new Rectangle(10,10,0,0);
		//Rectangle rect3 = new Rectangle(8,10,5,7);
		
		grid.reCenter(15,15);
		grid.drawRectangle(rect);
		//grid.drawRectangle(rect2);
		//grid.drawRectangle(rect3);
		//grid.display();
		
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
