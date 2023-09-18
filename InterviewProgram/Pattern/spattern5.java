package pattern;

import java.util.Scanner;

public class spattern5 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
	//	int row = sc.nextInt();
	//	int col = sc.nextInt();
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
