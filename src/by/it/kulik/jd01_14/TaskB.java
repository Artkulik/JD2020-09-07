package by.it.kulik.jd01_14;

import java.io.*;
import java.util.Arrays;

public class TaskB {
    public static void main(String[] args) {
        String src = System.getProperty("user.dir") + "/src/by/it/kulik/";
        String filename = src + "JD01_14/text.txt";
        File f = new File(filename);
        BufferedReader BR = null;
        int b,n = 0, count = 0;
        try {
            BR = new BufferedReader(new FileReader(f));
            while ((b = BR.read()) != -1) {
                System.out.print((char) b);
                if (b == ','){
                n++;
                }
                count++;
                }

            String res=BR.readLine();
            while (res!=null){
                res= BR.readLine();
                System.out.println(Arrays.toString(res.split(" ")));
            }
            System.out.println();
            System.out.println("\npunctuation marks="+n);
            System.out.println("\n Число байт=" + count);
            } catch (IOException e) {
            System.err.println(" Ошибка файла:" + e);
        } finally {
            try {
                if ( BR!= null) {
                    BR.close();
                }
            } catch (IOException e) {
                System.err.println("ошибка закрытия:" + e);
            }
        }
    }
}