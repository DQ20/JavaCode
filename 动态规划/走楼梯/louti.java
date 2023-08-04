import java.util.Scanner;
public class louti{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入楼梯数");
		int count=sc.nextInt();
		System.out.println(findStep(count));
	}
	public static int findStep(int n){
		if(n==1||n==2){
			return n;
		}
		return findStep(n-1)+findStep(n-2);
	}
 }