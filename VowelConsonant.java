import java.util.*;
class VowelConsonant{
     public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	char ch = sc.nextChar();
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
		System.out.println("Vowel");
	}else{
		System.out.println("Consonant");
	}
	
     }
}