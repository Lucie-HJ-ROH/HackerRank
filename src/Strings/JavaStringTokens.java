package Strings;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int cnt = 0;
        s = s.replaceAll("\\?|,|'|@|'|_|!|\\.", " ");
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < split.length ; i++) {
            if(split[i].length()!=0) {
                cnt++;
                sb.append(split[i] + "\n");
            }
        }
        System.out.println(cnt + "\n" + sb);
        scan.close();
    }
}
