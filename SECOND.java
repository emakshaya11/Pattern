package Pattern;
/*
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 5 5 5 5 5
 */

public class SECOND {
	public static void main(String[] args) {
		int n=5;
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col ++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}

}
