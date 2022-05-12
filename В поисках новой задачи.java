import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
    int [] numbers = new int[n];
    int a = 0;
    for (int i = 0; i < n; i++){
		    int input = scanner.nextInt();
		    numbers[i] = input;
		}
		for (int i = 0; i < n; i++){
      if (numbers [i]==0){
        a +=0;
      }
      else {
        a+=1;
      }
    }
		if (a==0){
      System.out.println("EASY");
    }
    else {
      System.out.println("HARD");
    }
	}
}