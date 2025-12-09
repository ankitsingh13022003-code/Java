public class hollowpattern {
    public static void hollow(int totalrow, int totalcol){
        for(int i=1;i<=totalrow;i++){
            for(int j=1;j<=totalcol;j++){
                if(i==1||i==totalrow||j==1||j==totalcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void inverted_half_pyaramid(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void half_pyramid_num(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //for number
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            // for(int j=1;j<i;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
    public static void half_pyramid_increasenum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum=sum+1;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void triangle_01(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        //1st half outer loop
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solid_rhombus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
         //outer loop
         for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star hoolow rhombus
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
    public static void diamond(int n){
        //outer loop 1st half
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*(i-1))+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop 2nd half
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*(i-1))+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //hollow(4,5);
        //inverted_half_pyaramid(4);
        //half_pyramid_num(5);
        //half_pyramid_increasenum(5);
        //triangle_01(5);
        //butterfly(4);
        //solid_rhombus(5);
        //hollow_rhombus(5);
        diamond(4);
    }
    
}
