package pattern;

/*
	A 
	A B 
	A B C 
	A B C D 
	A B C D E 
	A B C D E F  
 
 */

public class pattern46 {

	public static void main(String[] args) {
		String s = "ABCDEFGH";
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
