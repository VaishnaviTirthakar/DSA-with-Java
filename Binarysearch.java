public class Binarysearch {
    public static int binarysearch(int numaber[],int key){
        int start=0; 
        int end =numaber.length-1;

        while(start <= end){
            int mid =(start+end)/2;

            if(numaber[mid]==key){
                return mid;
            }
            if(numaber[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

            
    }

    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int key=25;

        System.out.println("index of key is="+ binarysearch(number,key));
    }
}


    

