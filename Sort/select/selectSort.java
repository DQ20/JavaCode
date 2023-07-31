public class selectSort{
	public static void main(String[] args){
		int[] arr={1,-1,29,17,0,1,-10,65536,0,8,-10,27};
		selectsort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
	}
	private static void selectsort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min=arr[i];
			int minPointer=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<min){
					min=arr[j];
					minPointer=j;
				}
		}
		change(arr,minPointer,i);
	}
	}
	private static void change(int[] arr,int x,int y){
		int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
	}
}