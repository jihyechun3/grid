package cs112hw3project02;

public class Grid 
{
	// declare the variables.
	private char[][] grid;
	private int dimensions;
	
	// initialize the variables.
	public Grid() 
	{
		dimensions = 20;
		grid = new char[dimensions][dimensions];
		
		for(int i = 0 ; i < dimensions ; i++)
		{			
			grid[i][2] = ' ';
			grid[2][i] = ' ';
		}
		
		
		for(int j = 0 ; j < dimensions ; j++)
		{
			grid[19][j] = ' ';
			grid[j][19] = ' ';	
		}
		

		/*
		for(int i = 0; i < dimensions ; i++)
		{
			// width
			for(int j = 0; j < dimensions ; j++)
			{
				grid[i][j] = ' ';
			}
		}*/
		
	}
	
	// draw rectangle
	public void drawRectangle(Rectangle rect) 
	{
		// �簢�� ������ �����ϱ�
		int width = 18;
		int length = 18;
		
		// ������ �׸���
		for(int i = 2 ; i < length + 2  ; i++)
		{	
			// �簢�� ���ʳ� ������ �׸��� 
			// �簢�� ��ġ ��ȯ�� ���ؼ� �ι�° ���� 2�� ����
			// [������ �ѱ���][��ǥ ������]
			// ù��°ĭ�� �� ���̸� �����ϴ°Ÿ� �ι�° ĭ�� ����
			// �������� ����  variable�� �����ϴ°�.
			grid[i][2] = '*';
			
			// �簢�� ���� �׸���, �簢���� ��ġ
			// ��ȯ�� ���ؼ� �պκ� �������� 2 �� ��ȯ 
			// [��ǥ ������][������ �� ����]
			grid[2][i] = '*';
		}
		
		// �簢�� ���ʺ��� �Ʒ��� �׸���
		for(int j = 2 ; j < width + 2 ; j++)
		{
			// �簢�� �Ʒ���
			//[������ ������ǥ][�ѱ���]
			grid[19][j] = '*';
			
			// �簢�� ���ʺ�
			//[������ �ѱ���][������ ������ǥ]
			grid[j][19] = '*';	
		}
		
		/*
		for(int i = 0 ; i < length ; i++)
		{
			i += 2;
			grid[i][0] = '*';
			
			for(int j = 0 ; j < width ; j++)
			{
				j += 2;
				grid[0][j] = '*';
					
			}
		}
		*/
		
		
		

	}

		/*
		for(int i = 8; i < dimensions - 8 ; i++)
		{
			// width
			for(int j = 8; j < dimensions - 8 ; j++)
			{
				grid[i][j] = '*';
			}
			
		}
		*/
	
	public char[][] getGrid()
	{
		return grid;
	}	
	public int getDimensions()
	{
		return dimensions;
	}
	
	/*
	// height 
	for(int i = 0; i < dimensions ; i++)
	{
		// width
		for(int j = 0; j < dimensions ; j++)
		{
			grid[i][j] = ' ';
		}
	}
	*/

	/*
	public void drawRectangle(Rectangle rect) 
	{
		int rows = rect.getLength();
		int cols = rect.getWidth();
		
		//char aRectangle[][] = new char[6][6];
		//aRectangle[5][5] = '*';
		
		//char aTriangle[] = new char[6];
		//aTriangle[5] = '*';
		
		// right side of the rectangle
		
		
		for(int i = 0 ; i < rows - 1 ; i++)
		{
			for(int j = 0; j < cols ; j++ )
			{	
				System.out.println(String.valueOf(aTriangle));
			}
		}
		
		// left side of the rectangle
		for(int leftRecCol = 0; leftRecCol < cols -1 ; leftRecCol++)
		{
			for(int leftRecRow = 0;leftRecRow < rows ; leftRecRow++ )
			{
				System.out.println(String.valueOf(aRectangle));
			}
		}
		*/
	public void display() {
		for(char[] r : this.grid) {
			for(char c : r) {
				System.out.print(c);
			}
			System.out.println(" ");
		}
	}
}
