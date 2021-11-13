package Strings;

import java.util.Scanner;

public class JavaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        StringBuilder sb = new StringBuilder();

        int sum = A.length() + B.length();

        sb.append(sum + "\n");
        if(A.compareTo(B)<=0){
            sb.append("No\n");
        }
        else {
            sb.append("Yes\n");
        }

        String firstA = A.substring(0,1);
        firstA = firstA.toUpperCase();
        String firstB = B.substring(0,1);
        firstB = firstB.toUpperCase();

        sb.append(firstA + A.substring(1) + " " + firstB + B.substring(1));
        System.out.println(sb);



    }
}
