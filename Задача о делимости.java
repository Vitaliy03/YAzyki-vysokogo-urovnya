import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
    for (int i = 0; i<n; i++){
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (a %b !=0){
        System.out.println(b-(a%b));
    }
      else {
        System.out.println(0);
      }
    
}
}
} 
