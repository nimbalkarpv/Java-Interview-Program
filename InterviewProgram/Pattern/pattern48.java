package pattern;

/*
 	A 
	B B 
	C C C 
	D D D D 
	E E E E E 
	F F F F F F
 */

public class pattern48 {

	public static void main(String[] args) {
		String s ="ABCDEFGHIJKLM";
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(s.charAt(i)+" ");
			}
			System.out.println();
		}

	}

}
