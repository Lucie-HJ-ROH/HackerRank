package strings;

import java.util.Scanner;

public class CombiningString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            str[i] = s;
        }
        for (int i = 0; i < n; i++) {
            String oddStr ="";
            String evenStr ="";
            for (int j = 0; j < str[i].length(); j++) {
                if(j%2!=0){
                    oddStr = oddStr + str[i].charAt(j);
                }else{
                    evenStr = evenStr + str[i].charAt(j);
                }
            }
            System.out.println(evenStr + " " + oddStr);
        }

    }
}
