package pattern;

/*

6 
6 5 
6 5 4 
6 5 4 3 
6 5 4 3 2 
6 5 4 3 2 1 
*/

public class sspattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			int k=6;
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}

	}

}
