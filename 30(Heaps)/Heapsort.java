public class Heapsort {
    public static void heapsort(int arr[]){
        int n= arr.length;
        for(int i=n/2;i>0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]= temp;
            heapify(arr,0,i);
        }
    }

    public static void heapify(int arr[], int i,int size){
        int left=2*i+1;
        int right= 2*i+2;
        int max=i;
        if(left<size && arr[left]>arr[max]){
            max=left;
        }
        if(right<size && arr[right]>arr[max]){
            max=right;
        }
        if(max !=i){
            int temp= arr[i];
            arr[i]=arr[max];
            arr[max]= temp;
            heapify(arr, max, size);

        }
    }

    public static void main(String[] args) {
        int arr[]= {5,3,4,2,1};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
