import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] menu = {{461, 431, 420, 0}, {100,57,70,0},{130,160,118,0},  {167,266,75,0}};
		Scanner sc = new Scanner(System.in);
		int calorie = 0;
		for (int i=0;i<4;i++) {
			int selection = sc.nextInt();
			calorie += menu[i][selection-1];
		}
		System.out.println("Your total Calorie count is "+ calorie +".");
		
		
	}

}
