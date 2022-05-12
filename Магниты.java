import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
    int [] numbers = new int [n+1];
    int a = 0;
    for (int i = 0; i < n; i++){
      int input = scanner.nextInt();
      numbers [i] = input;
    }
    numbers [n] = numbers [n-1];
    for (int i = 0; i < n; i++){
      if (numbers[i+1]==numbers[i]){
        a +=0;
      }
      else {
        a +=1;
      }
    }
    System.out.println(a+1);
	}
}