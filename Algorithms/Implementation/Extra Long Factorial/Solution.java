import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger solution = BigInteger.valueOf(n);
        for(int i = n-1; i > 0; i-- ){
            solution = solution.multiply(BigInteger.valueOf(i));
        }
        System.out.println(solution);
    }
}
