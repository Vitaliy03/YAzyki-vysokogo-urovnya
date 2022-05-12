import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
		int n = scanner.nextInt();
    int a = 0;
    while(n!=0){
      if (n >=100){
        n=n-100;
        a+=1;
      }
      else if ((n>=20)&(n<100)){
        n=n-20;
        a+=1;
      }
      else if ((n>=10)&(n<20)){
        n=n-10;
        a+=1;
      }
      else if ((n>=5)&(n<10)){
        n=n-5;
        a+=1;
      }
      else if ((n>=1)&(n<5)){
        n=n-1;
        a+=1;
        }
    
    }System.out.println(a);
      }
}

   
