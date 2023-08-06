import java.util.*;
public class Solve{
    public static void main(String[] args) {
       int M;
       int N;
       Scanner sc=new Scanner(System.in);
       System.out.println("请输入想要转化的数字");
       M=sc.nextInt();
       System.out.println("请输入想要转化的进制数");
       N=sc.nextInt();
       String s=solve(M,N);
       System.out.println(s);
    }
    public static String solve (int M, int N) {
        String[] arr={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        StringBuilder sb=new StringBuilder();
        int i=0;
        int tempM=M<0?-M:M;
        while(tempM>=(int)Math.pow(N,i)){
            i++;
        }
        for(int j=i;j>0;j--){
            int index=tempM/(int)Math.pow(N,j-1);
            tempM-=index*(int)Math.pow(N,j-1);
            sb.append(arr[index]);
        }
        if(M<0){
            sb.insert(0,"-");
        }
        String s=sb.toString();
        return s;
    }
}