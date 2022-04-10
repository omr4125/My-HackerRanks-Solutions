import java.util.Scanner;

public class EOf {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		
		while (scanner.hasNext()) {
			String string = (String) scanner.nextLine();
			i++;
			System.out.print(i + " " + string);
		}
	}

}
