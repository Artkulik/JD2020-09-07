package by.it.mialeshka.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ]{4,}");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()){
            int start = matcher.start();
            stb.setCharAt(start+3, '#');
            if (matcher.group().length() >=7){
                stb.setCharAt(start+6, '#');
            }
        }
        System.out.println(stb);
    }
}
