import java.util.*;
public class arrr {
    public static void update(int marks[],int nchageable){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }

    public static void main(String []args){
        int marks[]={99,90,98};
        int nchageable=5;
        update(marks,nchageable);
        System.out.println(nchageable);

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]+" ");

        }
        System.out.println();





    } 
}