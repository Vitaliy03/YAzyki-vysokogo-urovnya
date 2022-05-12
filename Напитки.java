import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
    int[] numbers = new int[n];
    double a = 0;
    for (int i = 0; i < n; i++){
      int input = scanner.nextInt();
      numbers [i] = input;
    }
    for (int i = 0; i < n; i++){
      a += numbers [i];
      }
    double b = a/n;
    System.out.println(b);
 
}
}