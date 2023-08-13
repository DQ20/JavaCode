import java.util.*;
public class toIP{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        long l=toInteger(s);
        if(l==-1){
            return;
        }
        System.out.println(l);
    }
    private static long toInteger(String s){
        long l=0l;
        String[] Nums=s.split("\\.");
        StringBuilder sb=new StringBuilder();
        if(s.charAt(0)=='.'||s.charAt(s.length()-1)=='.'){
            System.out.println("输入错误");
            return -1;
        }
        for(String sn:Nums){
            try{
                if(Integer.parseInt(sn)>255||Integer.parseInt(sn)<0){
                    System.out.println("输入错误");
                    return -1;
                }
                String padS=String.format("%08d",Integer.parseInt(Integer.toBinaryString(Integer.parseInt(sn))));
                sb.append(padS);
            }
            catch(Exception e){
                System.out.println("输入错误");
                return -1;
            }
        }
//        int x=Integer.parseInt(sb.toString(),2);
//        System.out.println(x);
        sb=sb.reverse();
        for(int i=0;i<sb.length();i++){
            l+=((int)sb.charAt(i)-48)*Math.pow(2,i);
        }
        return l;
    }

}