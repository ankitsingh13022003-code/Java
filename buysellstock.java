public class buysellstock {
    public static int stock(int a[]){
        int profit=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int currprofit=a[j]-a[i];
                if(currprofit>profit){
                    profit=currprofit;
                }
            }
        }
        if(profit>0){
            return profit;
        }
        else{
            return 0;
        }
    }
    public static int buysellstock2(int a[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<a.length;i++){
            if(buyprice<a[i]){
                int profit=a[i]-buyprice;//today profit
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=a[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int a[]={7,1,5,3,6,4};
        //System.out.println(stock(a));
        System.out.println(buysellstock2(a));
    }
    
}
