public class spiral {

    public static void Spiral(int Matrix[][]){
        int startrow=0;
        int endrow=Matrix.length-1;
        int startcol=0;
        int endcol=Matrix.length-1;

        while(startrow <= endrow && startcol <=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(Matrix[startrow][j]+" ");

            }

            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(Matrix[i][endcol]+" ");

            }

            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow== endrow){
                    break;
                }
                System.out.print(Matrix[endrow][j]+" ");

            }

            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(Matrix[i][startcol]+" ");

            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int Matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        Spiral(Matrix);

    }
        
}
    

