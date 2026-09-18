public class ReverseArr {
    public static void Revers(int number[]){
        int first=0;
        int last=number.length-1;

        while(first<last){
            //swap
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;

            first++;
            last--;

        }
        
    }
   

   public static void main(String[] var0) {
      int number[]={2,4,6,8,10};
      Revers(number);

      for(int i=0; i<number.length;i++){
        System.out.print(number[i]+" ");
      }
      System.out.println();
   }
}
