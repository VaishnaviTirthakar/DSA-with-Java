public class largestnum {
    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;


    }
    public static int getsmallest(int number[]){
        int Smallest=Integer.MAX_VALUE;
         for(int i=0;i<number.length;i++){
            if(Smallest>number[i]){
                Smallest=number[i];
            }
        }
        return Smallest;
    }
    public static void main(String[] args) {

        int number[]={1,2,6,3,5};

        System.out.println("The Largest Number of array="+getlargest(number));
        System.out.println("The Smallest Number of array="+getsmallest(number));
        
        

    }
    
}
