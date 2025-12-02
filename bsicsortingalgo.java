//import java.util.Arrays;
public class bsicsortingalgo {
    public static void bubblesort(int a[]){
        for(int turn=0;turn<a.length-1;turn++){
            for(int j=0;j<a.length-1-turn;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void selectionsort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minPos]>a[j]){
                    minPos=j;
                }
            }
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void insertionsort(int a[]){
        for(int i=1;i<a.length;i++){
            for(int j=i-1; j>=0;j--){
                if(a[j]>a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    i--;

                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void insertionsort2(int a[]){
        for(int i=1;i<a.length;i++){
            int current=a[i];
            int prev=i-1;
            //check out correct postion to be insert
            while(prev>=0 && a[prev]>current){
                a[prev+1]=a[prev];
                prev--;
            }
            //insertion
            a[prev+1]=current;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void countingsort(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(a[i],largest);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }
        //insertion
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;

            }
        }
    }
    public static void main(String args[]){
        int a[]={4,5,3,2,1};
        //bubblesort(a);
        //selectionsort(a);
        //insertionsort(a);
        //insertionsort2(a);
        //inbuilt funtion for sorting to use this we need to import.java.util.Arrays;
        //Arrays.sort(a);
        countingsort(a);
        printArray(a);
    }
    
}
