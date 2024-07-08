package pattern;
/*
	A B C D E F 
	B C D E F 
	C D E F 
	D E F 
	E F 
	F
*/		

public class pattern28 {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		for(int i=0;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
