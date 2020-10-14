package by.it.kulik.jd01_10;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> clazz = Math.class;
        Method[] methods=clazz.getDeclaredMethods();
        for (Method method:methods) {
            if ((method.getModifiers() & Modifier.PUBLIC) ==Modifier.PUBLIC)
                System.out.println(method);
        }

    }
}