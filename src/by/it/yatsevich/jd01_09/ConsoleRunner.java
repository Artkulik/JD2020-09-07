package by.it.yatsevich.jd01_09;

import java.util.Scanner;

class ConsoleRunner {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();
        for (;;) {
            String expression = scanner.nextLine();
            if (expression.equals("end")){
                break;
            }
            Var result = parser.calc(expression);
            printer.print(result);
        }
    }
}
