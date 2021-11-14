package dataStructure;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.stream.Collectors;

public class Java1DArray_Part2 {
    public static boolean canWin(int leap, int[] game) {
        return isSolve(leap,0,game,game.length);
    }

    public static boolean isSolve(int leap, int i, int[] game, int n){
        if(i<0 || game[i]==1){            return false;        }
        if(i==n-1 || i+leap >=n){            return true;        }
        game[i] = 1;
        return isSolve(leap, i-1, game, n)||isSolve(leap, i+1, game, n)||isSolve(leap, i+leap, game, n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}


