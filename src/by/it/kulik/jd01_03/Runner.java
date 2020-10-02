package by.it.kulik.jd01_03;

import java.util.Scanner;

import static by.it.kulik.jd01_03.InOut.getArray;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        double[] array = getArray(str);
        InOut.printArray(array);
        InOut.printArray(array, "V", 3);
        Helper.findMin(array);
        Helper.findMax(array);
        Helper.sort(array);

    }
}
