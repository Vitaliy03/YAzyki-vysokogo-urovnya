import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int k = scanner.nextInt();
    int l = scanner.nextInt();
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int d = scanner.nextInt();
    int a = 0;
    for (int i = 1; i <d+1; i++){
      if ((i%k==0)|(i%l==0)|(i%m==0)|(i%n==0)){
        a+=1;
      }
      else{
        a+=0;
      }
    }
    System.out.println (a);
}
}
   
