import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int x = A.length();
        int y = B.length();
        int lenght= x + y;
        System.out.println(lenght);
        
        int compare = A.compareTo(B);
        if(compare>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

       
        System.out.printf(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}