public class SelectionSort {

    public static void Selection(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){
            int minpos=turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){

                    minpos = j;

                }

            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[turn];
            arr[turn]=temp;
        }
    }

    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
        
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Selection(arr);
        printarr(arr);
        
    }
    
}
