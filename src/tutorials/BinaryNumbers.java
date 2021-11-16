package tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String str = Integer.toBinaryString(n);
        int cnt = 0;
        int tmp = 0;
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1'){
                cnt++;
            }
            if(str.charAt(i) =='0'){
                if(str.length()-i<cnt){
                    break;
                }
                tmp = cnt;
                cnt = 0;
            }
        }
        System.out.println(tmp<cnt?cnt:tmp);
        bufferedReader.close();
    }

}
