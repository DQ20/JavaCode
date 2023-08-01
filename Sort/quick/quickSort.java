import java.util.Arrays;
public class quickSort{
	public static void main(String[] args){
		int[] arr={1,-1,29,17,0,1,-10,65536,0,8,-10,27};
		System.out.println("原数组为:"+Arrays.toString(arr));
		quicksort(arr,0,arr.length-1);
        System.out.println("排序后数组为:"+Arrays.toString(arr));
	}
	private static void quicksort(int[] arr,int left,int right){
		if(left>=right){
			return;
		}
		int base=arr[left];
		int l=left;
		int r=right;
		int temp;
		while(left<right){
			while(left<right&&arr[right]>=base){
				right--;
			}
			while(left<right&&arr[left]<=base){
				left++;
			}
			temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
		arr[l]=arr[left];
		arr[left]=base;
		quicksort(arr,l,right-1);
		quicksort(arr,left+1,r);
	}
}