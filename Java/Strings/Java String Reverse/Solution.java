import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String InputString= keyboard.nextLine();
        int InputLenght= keyboard.nextInt();
        String smallest = "";
        String largest = "";
        
        for(int i=0; i<=InputString.length()-InputLenght;i++){
            String Temp = InputString.substring(i,i+InputLenght);
            if (i==0){
                smallest = Temp;
            }
            if(Temp.compareTo(largest)>0){
                largest = Temp;
            }
            else if(Temp.compareTo(smallest)<0){
                smallest = Temp;
            }
         
        }
          System.out.println(smallest);
          System.out.println(largest);  
            
    }

}