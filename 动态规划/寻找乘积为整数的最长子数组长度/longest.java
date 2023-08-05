import java.util.*;
public class longest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(searchArr(arr,n));
    }
    public static int searchArr(int[] arr,int n){
        int max=0;
        int[] positive=new int[n];
        int[] negative=new int[n];
        if(arr[0]>0){
            positive[0]=1;
            negative[0]=0;
            max=1;
        }
        else if(arr[0]<0){
            positive[0]=0;
            negative[0]=1;
        }
        else{
            negative[0]=0;
            positive[0]=0;
        }
        for(int i=1;i<n;i++){
            if(arr[i]>0){
                if(positive[i-1]>0){
                    positive[i]=positive[i-1]+1;
                }
                else{
                    positive[i]=1;
                }
                if(negative[i-1]>0){
                    negative[i]=negative[i-1]+1;
                }
                else{
                    negative[i]=0;
                }
            }
            else if(arr[i]<0){
                if(positive[i-1]>0){
                    negative[i]=positive[i-1]+1;
                }
                else{
                    negative[i]=1;
                }
                if(negative[i-1]>0){
                    positive[i]=negative[i-1]+1;
                }
                else{
                    positive[0]=0;
                }
            }
            else{
                positive[i]=0;
                negative[i]=0;
            }
            max=Math.max(max,positive[i]);
        }
        return max;
    }
}