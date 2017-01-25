import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
     
        char[] word1 = new char[A.length()];
        char[] word2 = new char[B.length()];
        
        for(int i = 0; i < A.length(); i++){
        	word1[i] = A.toUpperCase().charAt(i) ;
        }
        for(int i = 0; i < B.length(); i++){
        	word2[i] = B.toUpperCase().charAt(i) ;
        }
        Arrays.sort(word1);      
        Arrays.sort(word2);
     
        
        if (Arrays.equals(word1, word2)){
        	return true;
        }
        else{
        	return false;
        }
       
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
         sc.close();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}