import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Calculator extends BaseCalculator {

        public int getResult(int el1, String ch, int el2) {
            switch (ch) {
                case "+":
                    return el1 + el2;
                case "-":
                    return el1 - el2;
                case "*":
                    return el1 * el2;
                case "/":
                    return el1 / el2;

            }
            return 0;
        }
        public int getArab (String el) {
            int count = 0;
            while (!el.equals(ARRAY_ROME_COUNT[count])){
            count++;
            }
        return count + 1;
        }
        public String getRome (int el) throws Exception {
            if(el <= 0)
                throw new Exception("в римской системе нет отрицательных чисел");
            else if(el>10) {
                int x = el % 10;
                int ten = el / 10;
                return x == 0 ? ARRAY_ROME_COUNT_PLUS[ten] : ARRAY_ROME_COUNT_PLUS[ten - 1] + ARRAY_ROME_COUNT[x - 1];
            }else
                return ARRAY_ROME_COUNT[el-1];

    }
    public boolean inputRom(String el) {
            return Arrays.binarySearch(ARRAY_ROME_COUNT, el) != -1;
    }
    public boolean inputArab(String el) {
            return Arrays.binarySearch(ARRAY_ARAB_COUNT, el) != -1;
    }

}
