import java.util.Arrays;
public class mergeSort{
	public static void main(String[] args){
		int[] arr={1,-1,29,17,0,1,-10,65536,0,8,-10,27};
		System.out.println("原数组为:"+Arrays.toString(arr));
		mergesort(arr,0,arr.length-1);
        System.out.println("排序后数组为:"+Arrays.toString(arr));
	}
	private static void mergesort(int[] arr,int left,int right){
		if(left>=right){
			return;
		}
		int mid=(left+right)/2;
		mergesort(arr,left,mid);
		mergesort(arr,mid+1,right);
		merge(arr,left,mid,right);
	}
	private static void merge(int[] arr,int left,int mid,int right){
		int p1=left;
		int p2=mid+1;
		int k=left;
		int[] temp=new int[right-left+1];
		int i=0;
		while(p1<=mid&&p2<=right){
			if(arr[p1]<=arr[p2]){
				temp[i++]=arr[p1++];
			}
			else{
				temp[i++]=arr[p2++];
			}
		}
		while(p1<=mid){
			temp[i++]=arr[p1++];
		}
		while(p2<=right){
			temp[i++]=arr[p2++];
		}
		for(int j=0;j<temp.length;j++){
			arr[k]=temp[j];
			k++;
		}
	}	
}