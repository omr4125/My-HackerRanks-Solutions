import java.util.Scanner;

public class UsageOfStatic{
	static Scanner s = new Scanner(System.in);
	public static int B = s.nextInt();
	public static int H = s.nextInt();
	public static boolean flag = false;
	static{
		if(B <= 0 | H <= 0){
		    System.out.println("java.lang.Exception: Breadth and height must be positive");
		}else{
		    flag = true;
		}
	}
	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}
}

