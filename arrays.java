/*ques-1 maxsum of a asubarray-brute force 
import java.util.*;
public class arrays{
    public static void max_sum(int arr[]){
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                 curr_sum=0;
                for (int k=i;k<=j;k++){
                    curr_sum +=arr[k];
                }
                    if(curr_sum>max_sum){
                        max_sum=curr_sum;
                    }
                }
            }
            System.out.print(max_sum);
        }
        
    
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        max_sum(arr);

    }
}*/


//ques2-max subarray sum-prefix array 
/*import java.util.*;
public class arrays{
    public static void max_sum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
            
            if(currSum>maxSum){
                maxSum=currSum;
            }
        }
    }


System.out.println(maxSum);
    }
    public static void main (String args[]){
        int arr[]={1,-2,6,-1,3};
        max_sum(arr);
    }
}*/
/*ques-kadanes algo 
import java.util.*;
public class arrays{
    public static void max_sum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        currsum=currsum+arr[i];
        if(currsum<0){
            currsum=0;
        }
       maxsum= Math.max(currsum,maxsum);

    }
    System.out.print(maxsum);

    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        max_sum(arr);
    }
}*/


/*ques-rainwater trap */
/*import java.util.*;
public class arrays{
    public static int trapped(int height[]){
        int n=height.length;
        //leftmax
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=0;i<n;i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);

        }
        //rightmax
        int rightmax[]=new int[n];
       rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
       rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        

        //waterlevel
       // trapped water
       int trappedwater=0;
       for(int i=0;i<n;i++){
       int  waterlevel=Math.min(leftmax[i], rightmax[i]);
       trappedwater+=waterlevel-height[i];
       }
       return trappedwater;
    }
    public static void main(String args[]){
        int height[]={  4,2,0,6,3,2,5};
        System.out.print(trapped(height));
       
    }
}*/

//practice 
/*import java.util.*;
public class arrays{
    public static void surraysum(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
       
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=0;j<arr.length;j++){
                int end=j;
                currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.print(maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        surraysum(arr);
    }
}*/
//kadanes algo
/*import java.util.*;
public class arrays{
    public static void kadanes(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum=arr[i]+currsum;
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.print(maxsum);  
      }


    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        kadanes(arr);

    }
}*/


//waterlevel
/*import java.util.*;
public class arrays{
    public static int trappedwater(int height[]){
        //leftmax-auxillary array
        int n=height.length;
        int leftmax[]= new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        //rigtmax-auxillary array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
       // waterlevel
        //trappedwater
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            trappedwater+=waterlevel-height[i];
        }
return trappedwater;
        
}
        
    
    public static void main(String args[]){
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedwater(height));
    }
}*/



import java.util.*;
public class arrays{
    public static int maxprofit(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if( buyprice<prices[i]){
                int profit=prices[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
            buyprice=prices[i];

            }

        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[]={7, 1, 5, 3, 6,  4};
        System.out.print (maxprofit(prices));
    }
}