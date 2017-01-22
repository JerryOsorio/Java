import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String input = "";
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        while(keyboard.hasNext()==true){
            counter++;
            input = keyboard.nextLine();
            System.out.println(counter+" "+input);
        }
    }
}