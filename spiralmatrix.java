public class spiralmatrix {
    public static void spiral(int matrix[][]){
        //intialize startrow, startcol, endrow and endcol
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        //loop 
        while(startrow<=endrow&&startcol<=endcol){
            //print top boundary:-row same column varry: we use i for row and j for column
            for(int j=startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //print right boundary:-column same row varry
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //print bottom boundary:row same column varry
            for(int j=endcol-1;j>=startcol;j--){
                //in that case only single element will be remins at last we have already printed that in top boundary
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //print left boundary: column same row varry
            for(int i=endrow-1;i>=startrow+1;i--){
                if(endcol==startcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;


        }
        System.out.println();
        

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{12,13,14,15}};
        spiral(matrix);
    }
    
}
