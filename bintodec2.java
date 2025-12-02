//import java.util.*;
public class bintodec2 {
    public static void bintodec(int n){
        int pow=0;
        int decnum=0;
        while(n>0){
            int lastdigit=n%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow=pow+1;
            n=n/10;
        }
        System.out.println(decnum);

    }
    public static void dectobin(int n){
        int pow=0;
        int binnum=0;
        while(n>0){
            int remainder=n%2;
            binnum=binnum+(remainder*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(binnum);
    }
    public static void main(String args[]){
        bintodec(1011);
        dectobin(11);
    }
    
}
