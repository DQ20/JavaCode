public class shellSort{
	public static void main(String[] args){
		int[] arr={1,-1,29,17,0,1,-10,65536,0,8,-10,27};
		shellsort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
	}
	private static void shellsort(int[] arr){
		for(int gap=arr.length/2;gap>=1;gap/=2){
			int x=gap;
			while(x<2*gap){
				for(int i=x;i<arr.length;i+=gap){
				int index=i;
				int value=arr[index];
				while(index>=gap&&value<arr[index-gap]){
					arr[index]=arr[index-gap];
					index-=gap;
				}
				arr[index]=value;
				}
			x++;
		}
	}
}
}