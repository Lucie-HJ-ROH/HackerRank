package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RotateLeft {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        int d = 4;

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);


        for (int i = 0; i < d; i++) {   //using this for block. it is so easy...
            int tmp = arr.get(0);
            arr.remove(0);
            arr.add(tmp);
            System.out.println(arr);
        }

    }
}