public class insertSort{
	public static void main(String[] args){
		int[] arr={1,-1,29,17,0,1,-10,65536,0,8,-10,27};
		insertsort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
	}
	private static void insertsort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int index=i;
			for(int j=index-1;j>=0;j--){
				if(arr[index]>=arr[j]){
					break;
				}
				change(arr,index,j);
				index--;
			}
		}
	}
	private static void change(int[] arr,int x,int y){
		int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
	}
}