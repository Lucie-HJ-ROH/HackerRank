package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArraysTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Collections.reverse(arr);
        /**
         * list.toString problem -> [2, 3, 4, 1]
         * using replaceAll() : replaceAll("\\[|\\]|,", "");
         */

        String str = arr.toString().replaceAll("\\[|\\]|,", "");
        System.out.println(str);


        bufferedReader.close();
    }
}
