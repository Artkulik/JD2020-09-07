package by.it.hryntsaliou.jd02_04;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) throws CalcException {
        Scanner scanner=new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();
        try {
            Var.load();
        } catch (CalcException e) {
            e.printStackTrace();
        }
        for(;;){
            String line = scanner.nextLine();
            saveLogToTxt(line);
            if (line.equals("end"))
                break;
            Var result = null;
            try {
                result = parser.calc(line);
                saveLogToTxt(String.valueOf(result));
            } catch (CalcException e) {
                System.out.println(e.getMessage());
                saveLogToTxt(e.getMessage());
            }
            printer.print (result);
        }
    }

    private static void saveLogToTxt(String message) throws CalcException {
        String path = getPath() + "log.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(path, true))) {
            writer.println(message);

        } catch (IOException e) {
            throw new CalcException(e);
        }
    }

    private static String getPath() {
        String rootProject = System.getProperty("user.dir");
        String relativePath = ConsoleRunner.class
                .getName()
                .replace(ConsoleRunner.class.getSimpleName(), "")
                .replace(".", File.separator);
        return rootProject + File.separator + "src" + File.separator + relativePath;
    }



}
