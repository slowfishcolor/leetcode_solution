package no170TwoSumIII;

import java.util.Scanner;

/**
 * Created by Prophet on 2017/2/2.
 */
public class TestTwoSumIII {
    public static void main(String[] args) {
        TwoSumIIISolution solution = new TwoSumIIISolution_1();
        Scanner scanner = new Scanner(System.in);
        String inputStr = null;
        while(true) {
            inputStr = scanner.next();
            if (inputStr.matches("add\\([0-9]+\\)")) {
                int input = Integer.parseInt(inputStr.substring(4, inputStr.length() - 1));
                solution.add(input);
            }
            else if (inputStr.matches("find\\([0-9]+\\)")) {
                int input = Integer.parseInt(inputStr.substring(5, inputStr.length() - 1));
                System.out.println(solution.find(input));
            }
            else if (inputStr.matches("exit")) {
                break;
            }
        }
    }
}
