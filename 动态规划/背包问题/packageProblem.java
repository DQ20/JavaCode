import java.util.*;
public class packageProblem {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int number=in.nextInt();
       int capacity=in.nextInt();
       int[] volume=new int[number];
       int[] value=new int[number];
       for(int i=0;i<number;i++){
            volume[i]=in.nextInt();
            value[i]=in.nextInt();
       }
       int v[][]=new int[number+1][capacity+1];
       for(int i=1;i<v.length;i++){
        for(int j=1;j<v[0].length;j++){
            if(volume[i-1]>j){
                v[i][j]=v[i-1][j];
            }
            else{
				v[i][j]=Math.max(value[i-1]+v[i-1][j-volume[i-1]],v[i-1][j]);
            }
        }
       }
       System.out.println(v[number][capacity]);
    }
}