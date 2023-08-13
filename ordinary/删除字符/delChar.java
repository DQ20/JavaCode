import java.util.*;
public class delChar{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        char[] cs=delchar(str);
        for(int i=0;i<cs.length;i++){
            if(cs[i]==0){
                break;
            }
            else{
                String s=String.valueOf(cs[i]);
                str=str.replace(s,"");
            }
        }
        System.out.println(String.valueOf(cs));
        System.out.println(str);
    }
    private static char[] delchar(String str){
        Map<Character,Integer> map=new HashMap<>();
        char[] cs=new char[str.length()];
        int index=0;
        int min=str.length();
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }
            else {
                int tn=map.get(str.charAt(i));
                tn+=1;
                map.put(str.charAt(i),tn);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()<min){
                min=entry.getValue();
                cs=new char[str.length()];
                index=0;
                cs[index]=entry.getKey();
            }
            else if(entry.getValue()==min){
                index++;
                cs[index]=entry.getKey();
            }
        }
        return cs;
    }
}