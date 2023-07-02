import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Этот калькулятор производит вычисления с целыми числами от 1 до 10\n " +
                "Введите задачу по формату \"a + b\",\"a - b\",\"a * b\",\"a / b\", допускается ввод римскими цифрами.");
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Scanner scanner = new Scanner(reader);
            Calculator calculator = new Calculator();
            String line = scanner.nextLine();
            String[] math1 = line.split(" ");
            if (math1.length < 3) {
                throw new Exception("строка не является математической операцией");
            } else if (math1.length != 3) {
                throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } else if (calculator.searchZnak(math1[1])) {
                throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            } else if (calculator.searchArab(math1[0]) != calculator.searchArab(math1[2])
                    || calculator.searchRome(math1[0]) != calculator.searchRome(math1[2])) {
                throw new Exception("используются одновременно разные системы счисления");
            }

            String result ="";

             if (calculator.searchRome(math1[2])) {
                int a = calculator.getArab(math1[0]);
                int b = calculator.getArab(math1[2]);
                result = calculator.getRome(calculator.getResult(a, math1[1], b));
            } else if (calculator.searchArab(math1[2])) {
                 int a = Integer.parseInt(math1[0]);
                 int b = Integer.parseInt(math1[2]);
                 result = calculator.getResult(a, math1[1], b) + "";
             }

            System.out.println(result);

        }
    }
}