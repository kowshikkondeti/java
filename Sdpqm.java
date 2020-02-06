import java.util.*;
class Sdpqm{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		int a=sc.nextInt();
		System.out.println("enter 2st number");
		int b = sc.nextInt();
		int sum=a+b;
		System.out.println(sum);
		int div=a/b;
		System.out.println(div);
		int pro=a*b;
		System.out.println(pro);
		if(a>b){ 
		System.out.println(b);}
		else{
		System.out.println(a);}
		if(a<b){
		System.out.println(b);}
		else{
		System.out.println(a);
		}
}
}