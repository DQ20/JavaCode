import java.util.*;
public class TwoSum{
	public static void main(String[] args){
		int[] arr={31,20,-2,-9,0,39,126,2,6,7};
		int target=30;
		System.out.println(Arrays.toString(twoSum(arr,target)));
	}
	private static int[] twoSum(int[] arr,int target){
		Map<Integer,Integer> map=new HashMap<>();
		int[] temp=new int[2];
		for(int i=0;i<arr.length;i++){
			if(map.get(target-arr[i])!=null){
				temp[0]=map.get(target-arr[i]);
				temp[1]=i;
				break;
			}
			map.put(arr[i],i);
		}
		return temp;
	}
}