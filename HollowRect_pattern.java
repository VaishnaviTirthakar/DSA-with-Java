public class HollowRect_pattern {

    public static void hollowrect(int totrows, int totcols){
        for (int i=1; i<=totrows; i++){
            for(int j=1; j<=totcols; j++){
                if(i==1 || i == totrows || j==1 || j==totcols){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowrect(6, 6);
        
    }
    
}
