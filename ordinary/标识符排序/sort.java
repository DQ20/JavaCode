import java.util.*;
public class sort{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scanner.nextInt();
		}
		int flag=scanner.nextInt();
		sortF(arr,flag);
		for(int x:arr){
			System.out.print(x+" ");
		}
	}
	private static void sortF(int[] arr,int flag){
		for(int i=arr.length/2;i>0;i/=2){
			int x=i;
			while(x<i*2){
				for(int j=x;j<arr.length;j+=i){
				int index=j;
				int value=arr[index];
					//升序
					if(flag==0){
						while(index>=i&&value<=arr[index-i])
						{
							arr[index]=arr[index-i];
							index-=i;
						}
						arr[index]=value;
					}
					//降序
					else if(flag==1){
						while(index>=j&&value>=arr[index-i])
						{
							arr[index]=arr[index-i];
							index-=i;
						}
						arr[index]=value;
					}
					else{
						System.out.println("输入出错");					
					}
				}
				x++;
			}
		}
	}
}