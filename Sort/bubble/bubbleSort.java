public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={1,-1,29,17,0,1,-10,65536,0,8,-10,27};
        bubblesort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    private static void bubblesort(int[] arr) {
        for (int i = arr.length; i >=1; i--) {
            for (int j = 0; j < i; j++) {
                if(j<arr.length-1&&arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}