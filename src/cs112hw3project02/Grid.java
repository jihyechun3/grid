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
		// 사각형 사이즈 설정하기
		int width = 18;
		int length = 18;
		
		// 세로줄 그리기
		for(int i = 2 ; i < length + 2  ; i++)
		{	
			// 사각형 왼쪽끝 세로줄 그리기 
			// 사각형 위치 변환을 위해서 두번째 수를 2로 고정
			// [세로줄 총길이][좌표 시작점]
			// 첫번째칸이 총 길이를 설정하는거면 두번째 칸이 시작
			// 뻗어지는 줄을  variable로 설정하는것.
			grid[i][2] = '*';
			
			// 사각형 윗변 그리기, 사각형의 위치
			// 변환을 위해서 앞부분 시작점을 2 로 변환 
			// [좌표 시작점][가로줄 총 길이]
			grid[2][i] = '*';
		}
		
		// 사각형 왼쪽변과 아랫변 그리기
		for(int j = 2 ; j < width + 2 ; j++)
		{
			// 사각형 아랫변
			//[가로줄 시작좌표][총길이]
			grid[19][j] = '*';
			
			// 사각형 왼쪽변
			//[세로줄 총길이][세로줄 시작좌표]
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
