package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int cntNega = 0;
        int cntPasi = 0;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int total = Arrays.stream(A).sum();

        //  List<Integer> list = new ArrayList<>();
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + A[j];
                if (sum < 0) {
                    cntNega++;
                }
            }
        }
        System.out.println(cntNega);
    }

}