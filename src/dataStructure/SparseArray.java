package dataStructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class SparseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        List<String> str = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            str.add(sc.nextLine());
        }

        int cnt = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < cnt; i++) {
            String tmp = sc.nextLine();
            result.add(Collections.frequency(str,tmp));//find same string in str list using Collection.frequency
                                                        //it returns integer, it's like count.
        }

        System.out.println(result);
    }
}
