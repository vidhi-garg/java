/*import java.util.*;
public class sorting{
    public static void selecsort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
if(arr[j]>arr[j+1]){
    int temp=arr[j];
     arr[j]= arr[j+1];
     arr[j+1]=temp;

                }
            }
        }

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main (String args[]){

        int arr[]={5,4,1,3,2};
        selecsort(arr);
        printarr(arr);


    }
}*/

//selection sort
/*import java.util.*;
public class sorting{
    public static void selectionsort(int array[]){
 for (int i=0;i<array.length-1;i++){
    int minPos=i;
    for (int j=i+1;j<array.length;j++){
        if(array[minPos]>array[j]){
            minPos=j;
        }
       
    }
    //swap
    int temp=array[minPos];
             array[minPos]=array[i]; 
             array[i]=temp;

 }
 
 }
    public static void outarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        selectionsort(array);
        outarray(array);
    }
}*/


//insertion sort
/*import java.util.*;
public class sorting{
    public static void insertionsort(int arr[]){
        
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
        int previous=i-1;
        while(previous>=0 && curr<arr[previous]){
            arr[previous+1]=arr[previous];
            previous--;

        }
        arr[previous+1]=curr;

        }
       


    }
    public static void outarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        outarray(arr);
    }
}*/


//inbuilt sort
/*import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class sorting{
    public static void main(String args[]){
     Integer arr[]={5,4,3,2,1};
        Arrays.sort(arr,0,3);
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}*/

//practice ques
import java.util.*;
public class sorting{
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
     if(arr[j]<arr[j+1]){
    int temp=  arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}
            }
        }
    }
    public static void selectionsort(int array[]){
        for (int i=0;i<array.length-1;i++){
           int minPos=i;
           for (int j=i+1;j<array.length;j++){
               if(array[minPos]<array[j]){
                   minPos=j;
               }
              
           }
           //swap
           int temp=array[minPos];
                    array[minPos]=array[i]; 
                    array[i]=temp;
       
        }
        
        }
        public static void insertionsort(int arr[])
        {
for(int i=0;i<arr.length-1;i++){
    int curr=arr[i];
    int prev=i-1;
    while(prev>=0 && curr>arr[prev]){
        arr[prev+1]=arr[prev];
        prev--;
    }
    arr[prev+1]=curr;
}
        }



    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};

insertionsort(arr);
printarr(arr);
    }
}
