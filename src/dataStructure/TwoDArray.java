package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoDArray {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
//        List<Integer> tmp1 = new ArrayList<>(Arrays.asList(1,1,1,0,0,0));
//        List<Integer> tmp2 = new ArrayList<>(Arrays.asList(0,1,0,0,0,0));
//        List<Integer> tmp3 = new ArrayList<>(Arrays.asList(1,1,1,0,0,0));
//        List<Integer> tmp4 = new ArrayList<>(Arrays.asList(0,0,2,4,4,0));
//        List<Integer> tmp5 = new ArrayList<>(Arrays.asList(0,0,0,2,0,0));
//        List<Integer> tmp6 = new ArrayList<>(Arrays.asList(0,0,1,2,4,0));
        List<Integer> tmp1 = new ArrayList<>(Arrays.asList(-1,-1,0,-9,-2,-2));
        List<Integer> tmp2 = new ArrayList<>(Arrays.asList(-2,-1,-6,-8,-2,-5));
        List<Integer> tmp3 = new ArrayList<>(Arrays.asList(-1,-1,-1,-2,-3,-4));
        List<Integer> tmp4 = new ArrayList<>(Arrays.asList(-1,-9,-2,-4,-4,-5));
        List<Integer> tmp5 = new ArrayList<>(Arrays.asList(-7,-3,-3,-2,-9,-9));
        List<Integer> tmp6 = new ArrayList<>(Arrays.asList(-1,-3,-1,-2,-4,-5));

        arr.add(tmp1);
        arr.add(tmp2);
        arr.add(tmp3);
        arr.add(tmp4);
        arr.add(tmp5);
        arr.add(tmp6);

        List<Integer> max = new ArrayList<>();
        for (int x = 0; x <4 ; x++) {
            for(int y = 0; y<4 ; y++){
                int sum = arr.get(x).get(y) + arr.get(x).get(y+1) + arr.get(x).get(y+2) +
                                            + arr.get(x+1).get(y+1)  +
                                arr.get(x+2).get(y) + arr.get(x+2).get(y+1) + arr.get(x+2).get(y+2);


                max.add(sum);
                System.out.print(sum + " , ");
            }
        }

        System.out.println("\n" + Collections.max(max));

    }
}
