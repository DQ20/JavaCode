import java.util.*;
public class Coordinate{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		int[] coo=coordinate(s);
		System.out.print(coo[0]);
		System.out.print(",");
		System.out.println(coo[1]);
	}
	private static int[] coordinate(String s){
		int[] coo=new int[2];
		String[] arr=s.split(";");
		List<Character> list=Arrays.asList('A','W','S','D');
		int num;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null||arr[i].length()<=1||arr[i].length()>3){
				continue;
			}
			if(!list.contains(arr[i].charAt(0))){
				continue;
			}
			try{
				num=Integer.parseInt(arr[i].substring(1));
			}
			catch(Exception e)
			{
				continue;
			}
			switch(arr[i].charAt(0)){
				case 'A':coo[0]-=num;
				break;
				case 'D':coo[0]+=num;
				break;
				case 'W':coo[1]+=num;
				break;
				case 'S':coo[1]-=num;
				break;
				default:
				break;
			}
		}
		
		return coo;
	}
}