package pattern;

/*
 1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
 */

public class spatternmis1 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			
			for(int j=1;j<=6;j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
				System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
