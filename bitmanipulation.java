/*import java.util.*;
public class bitmanipulation {
    public static void main(String args[]){
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(5>>2);

    }
    
}*/

//ques-chek if a number is odd or even
/*import java.util.*;
public class bitmanipulation{
    public static void oddeven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        oddeven(3);
        oddeven(4);

    }
}*/

//ques-get ith bit
/*import java.util.*;
public class bitmanipulation{
    public static int setbit(int n,int i){
        int bitmask=1<<2;
        if((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.print(setbit(10,2));

    }
} */


//ques set ith bit
/*import java.util.*;
public class bitmanipulation{
    public static int setbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
        System.out.print(setbit(8,1));

    }
}*/

//ques clear ith bit
/*import java.util.*;
public class bitmanipulation {
    public static int clearbit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;

    }
    public static void main (String args[]){
        System.out.println(clearbit(8,3));

    }

}*/


//ques update bit -not done
/*import java.util.*;
public class bitmanipulation{
    public static int clearbit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;

    }

    public static int setbit(int n,int i){
        int bitmask=1<<2;
        if((n & bitmask)==0){
            return 0;
        }
    }

    public static int updatebit(int n,int i,int newbit){
        if(newbit==0){
            return clearbit(n,i);
        }
        else{
           return  setbit(n,i);
        }
    }
    public static void main(String args[]){

    }
}
}*/


//ques-clear last ith bit
/*import java.util.*;
public class bitmanipulation{
    public static int clearlastbit(int n,int i){
        int bitmask=(~0)<<i;
        return bitmask & n;
    }
    public static void main(String args[]){
        System.out.print (clearlastbit(15,2));

    }
}*/

//ques-check if a number is power of two 

/*import java.util.*;
public class bitmanipulation{
    public static boolean ispoweroftwo(int n){
        return (n & (n-1)) == 0;

    }
    public static void main(String args[]){
        System.out.print(ispoweroftwo(10));

    }
}*/

//ques-count set bit

/*import java.util.*;
public class bitmanipulation{
    public static int countsetbit(int n){
        int count=0;
        while(n>0){
            if((n & 1 )!=0){
                count++;
            }
           n= n >> 1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countsetbit(10));

    }
}*/

//ques=fast exponentiation
/*import java.util.*;
public class bitmanipulation{
    public static int fastexpo(int n,int a){
        int ans=1;
        while(n>0){
            if((n&1)!= 0){
                ans=a*ans;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
System.out.print(fastexpo(3,5));
    }
}*/

//practice question 
import java.util.*;
public class bitmanipulation{
    public static void main(String args[]){
        int x=3;
        int y=4;
        System.out.print("num a before:" + x+"num b before :"+y);
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("afer swap x:"+x+"afyer swap y:"+y);

    }
}