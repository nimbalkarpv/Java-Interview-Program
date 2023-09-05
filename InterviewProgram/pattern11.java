package pattern;

/*
  
 1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1  
  
 */

public class pattern11 {

	public static void main(String[] args) {
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				int total =i+j;
				if(total % 2 == 0 ) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}

	}

}
