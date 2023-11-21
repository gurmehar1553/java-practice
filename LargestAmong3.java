import java.util.*;
class LargestAmong3{
     public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int largest = Math.max(Math.max(a,b),c);
	System.out.println(largest);
	
     }
}