import java.util.Scanner;

public class Solution05 {

	public static void main(String[] args) {

		/*
		 double sayi5=Math.pow(3, 2); // 3^2
		 	Sample Input
			2
			0 2 10
			5 3 5
			Sample Output
			2 6 14 30 62 126 254 510 1022 2046
			8 14 26 50 98
		 
		 */
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum = a;
            for (int j = 0; j < n; j++) {
            	sum +=  Math.pow(2, j) * b;
            	System.out.print((int) sum + " ");
			}
            System.out.println();
           
        }
	}

}
