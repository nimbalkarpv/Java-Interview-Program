package pattern;

public class pattern2 {

	public static void main(String[] args) {
		
		int row = 4;
		int colm = 5;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=colm; j++) {
				
				if(i == 1 || j == 1 || i == row ||j == colm  ) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
/* ====================================
	* * * * *
	*       *
	*       *
	* * * * *
*/
