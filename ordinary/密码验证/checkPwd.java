import java.util.*;
public class checkPwd{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		String result=checkpwd(str);
		System.out.println(result);
	}
	private static String checkpwd(String str){
		if(str.length()<=8){
			return "NG";
		}
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		for(int i=0;i<str.length();i++){
			if('a'<=str.charAt(i)&&str.charAt(i)<='z'){
				num1=1;
			}
			else if('A'<=str.charAt(i)&&str.charAt(i)<='Z'){
				num2=1;
			}
			else if('0'<=str.charAt(i)&&str.charAt(i)<='9'){
				num3=1;
			}
			else{
				num4=1;
			}
		}
		if(num1+num2+num3+num4<3){
			return "NG";
		}
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<str.length()-2;i++){
			if(map.get(str.substring(i,i+2))!=null){
				return "NG";
			}
			map.put(str.substring(i,i+2),1);
		}
		return "OK";
	}
}