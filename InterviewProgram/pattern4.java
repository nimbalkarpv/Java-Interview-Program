package pattern;

public class pattern4 {

	public static void main(String[] args) {
	/*	int row = 3;
		int colm = 4;
		int i;
		for( i=0; i<=4; i++) {
			int k = 4-i;
			for(int j=0; j<=k; j++) {
				System.out.print("* ");
			}
			System.out.println("  ");
		}

* * * *   
* * *   
* *   
* 

	*/
	   for(int i=1; i<=4; i++) {
		   for(int j=4; j-i>=0; j--) {
			   System.out.print("* ");
		   }
		   System.out.println("  ");
	   }
	}

}
