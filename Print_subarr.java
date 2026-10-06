public class Print_subarr {
    public static void subarray(int num[]){
        //int currsum=0;
        //int maxsum=Integer.MIN_VALUE;
        int ts=0;
        for(int i=0; i<num.length;i++){
            int start=i;

            for(int j=i;j<num.length;j++){
                int end=j;
                //currsum=0;
                System.out.print("{");
                for(int k=start; k<=end;k++){
                    //System.out.print("{");
                    //currsum+=num[k];
                    System.out.print(num[k]+" ");

                    /*System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }*/
                    
                }
                
                ts++;   
                System.out.println("}");
            }
            //System.out.println("max sum="+maxsum);

            System.out.println();

        }
        //System.out.println();
        System.out.println("The total number of subarray="+ts);

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        subarray(num);
        
    }
    
}
