//print pattern
public class pattern {
    public static void main (String arg[]){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}


//print inverted pattern
public static void main (String arg[]){
    int n=4;
    for(int i=1;i<=4;i++){
        for(int j=1;i<=(n-i+1);i++){
            System.out.print("*");

        }
        System.out.println();

    }
}



