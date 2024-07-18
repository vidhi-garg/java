//ques-1decreasing order
/*import java.util.*;
public class recursion {
    public static void recursionbasics(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        recursionbasics(n-1);
    }
    public static void main(String args[]){
        int n=10;
        recursionbasics(n);
    }
    
}*/

//increasing order
/*import java.util.*;
public class recursion{
    public static void recursionbasics(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        recursionbasics(n-1);
        System.out.print(n);
        
    }
    
    public static void main(String args[]){
        int n=5;
        recursionbasics(n);
    }
}*/

//ques factorial of a number

/*import java.util.*;
public class recursion{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
int fnm1=factorial(n-1);
int fn=n*factorial(n-1);
return fn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(factorial(n));
    }
}*/

//ques=print sum of first n natural number
/*import java.util.*;
public class recursion{
    public static int sum(int n){
if(n==1){
    return 1;
}
int fnm1=sum(n-1);
int sn=n+fnm1;
return sn;
    }
    public static void main(String args[]){
int n=5;
System.out.println(sum(n));
    }
}*/
// import java.util.*;
// public class recursion{
//     public static int calculateSum(int n){
//         if(n==1){
//             return 1;
//         }
//         int snm1=calculateSum(n-1);
//         int sn=n+snm1;
//         return sn;
//     }
//     public static void main(String args[]){
//         int n;
//        System.out.print(calculateSum(5)) ;
//     }
// }

//ques-check if arr is sorted or not 
// import java.util.*;
// public class recursion{
//     public static boolean isSorted(int arr[],int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//        return  isSorted(arr,i+1);
//     }
//     public static void main(String args[]){
//         int arr[]={1,2,3,4,5};
//         System.out.println(isSorted(arr,0));
//     }
// }

//first occurence
// import java.util.*;
// public class recursion{
//     public static int firstOccurence(int arr,int key,int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
// return i;
//         }
//         return firstOccurence(arr, key,i+1);
//     }

//     public static void main(String args[]){
//         int arr[]={8,3,6,9,5,10,2,5,3};
//         int key;
//         System.out.println(firstOccurence(arr,0,5));
//     }
// }

//qies=last occurence
// 

// //power ofx^n
// import java.util.*;
// public class recursion{
//     public static int power(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         // int xnm1=power(x,n-1);
//         // int xn=x*xnm1;
//         // return xn;
//         return x*power(x,n-1);

//     }
//     public static void main(String args[]){
//        int x;
//        int n;
//        System.out.print(power(2,10));

//     }
// }

//optimizes xn
// import java.util.*;
// public class recursion{
//     public static int power(int x,int n){
//         if(n==0){
//             return 1;
//         }
// //   int halfpowersq=power(x,n/2)*power(x,n/2);
// int halfpower=power(x,n/2);
// int halfpowersq=halfpower*halfpower;
//   if(n%2!=0){
//     halfpowersq=x*halfpowersq;
//   }
//   return halfpowersq;
//     }

//     public static void main(String args[]){
//         int x;
//         int n;
// System.out.print(power(2,10));
//     }
// }

//ques tilling problem
// import java.util.*;
// public class recursion{
//     public static int tillingProb(int n){
//         //base case
//         if(n==0||n==1){
//             return 1;
//         }
//         //kaam
//         //vertical choice

//         int fnm1=tillingProb(n-1);
//         //horizontal choice
//         int fnm2=tillingProb(n-2);
//         int totalWays=fnm1+fnm2;
//         return totalWays;
//     }
//     public static void main(String  args[]){

// int n;
// System.out.print(tillingProb(4));
//     }
//}

//ques remove duplicates from strings
//ques friend pairing problem
import java.util.*;
public class recursion{
    public static void pairing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=pairing(n-1);
        //pairs
        int fnm2=pairing(n-2);
        int totalways=(n-1)*pairing(n-2);

    }
    public static void main(String args[]){

    }
}
