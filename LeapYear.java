import java.util.*;

class LeapYear{
     public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int inp = sc.nextInt();
	boolean ans = (inp % 4 == 0)?true : false;
	System.out.println(ans);
     }
}