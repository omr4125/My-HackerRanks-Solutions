import java.util.Scanner;

public class Solution03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");

        for(int i=0;i<3;i++){
            String s1=sc.next();
            
            int x=sc.nextInt();
            //Complete this line
            if ((s1.length() <= 10) && (x <= 999 && x >= 0)) {
				
            		System.out.printf("%-15s", s1);
					System.out.printf("%03d \n", x);
			}
        }
        System.out.println("================================");
        sc.close();
	}

}





