package by.it.shkatula.jd01_03;

public class InOut {

    static double[ ] getArray(String line) {

       String[] getArray = line.split(" ");
        double[] resArr = new double[getArray.length];
        for (int i = 0; i < getArray.length; i++) {
            resArr[i] = Double.parseDouble(getArray[i]);
        }
        return resArr;
    }
    static void printArray(double[ ] arr) {
        for (double element : arr) {
            System.out.print(element+" ");
        }
System.out.println();
    }
    static void printArray(double[ ] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=% -5.1f",name,i,arr[i]);
            if ((i + 1) % columnCount == 0 || i+1==arr.length)

                System.out.println();

            }
        }

    }

