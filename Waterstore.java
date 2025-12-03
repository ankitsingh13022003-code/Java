import java.util.ArrayList;
import java.util.Collections;
public class Waterstore {
    public static int  Waterstore2(ArrayList<Integer> height){
        int maxwater=Integer.MIN_VALUE;
        int lp=0;//left height
        int rp=height.size()-1;//right height
        while(lp<rp){
            int width=rp-lp;
            int ht=Math.min(height.get(lp), height.get(rp));
            int currwater=width*ht;
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
            maxwater=Math.max(currwater, maxwater);
        }
        return maxwater;

    }
    public static int waterStore(ArrayList<Integer> height){
        int maxwater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int width=j-i;
                int ht=Math.min(height.get(i), height.get(j));
                int currwater=width*ht;
                maxwater=Math.max(maxwater, currwater);

            }
        }
        return maxwater;

    }
    public static boolean pairsum(ArrayList<Integer> height,int target){
        //sorted Ararylist
        int lp=0;
        int rp=height.size()-1;
        while(lp!=rp){
            int tgt=height.get(lp)+height.get(rp);
            
            if(tgt==target){
                return true;
            }
            if(tgt<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static boolean pairSum(ArrayList<Integer> list, int target){
        // sorted and rotated arraylist 
        int bp=-1;//breaking/pivot point
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;//smallest number index
        int rp=bp; //largest number index
        int n=list.size();
        while(rp!=lp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }else if(list.get(rp)+list.get(lp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        //System.out.println(height);
        System.out.println(waterStore(height));
        System.out.println(Waterstore2(height));
        Collections.sort(height);
        System.out.println(pairsum(height, 19));
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list, 22));
    }
    
}
