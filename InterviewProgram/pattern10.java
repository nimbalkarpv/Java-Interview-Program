package pattern;

/*
  
1 
2 3 
4 5 6 
7 8 9 10  
  
 */
public class pattern10 {
	static int count =1;
	public static void main(String[] args) {
		
		for(int i=1; i<=4;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
