package Strings;

import java.util.Scanner;

public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String tmp = "";
            int sum = a;
            for (int j = 0; j < n; j++) {
                double result = Math.pow(2,j);
                sum = sum + (int)result*b;
                str.append(sum + " ");
            }
            str.append("\n");
        }
        //
        System.out.println(str);
    }
}
