package pattern;

public class pattern7 {
	/*
	 
	  * 
    * * 
  * * * 
* * * * 
	 
	 */

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=0; j < 4-i;j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		
			System.out.println("");
		}
		

	}

}
