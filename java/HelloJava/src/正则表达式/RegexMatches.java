package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    public static void main(String[] args) {

        //按指定模式在字符串查找
        String line = "This order was place for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        //创建Pattern对象
        Pattern pattern1 = Pattern.compile(pattern);

        //现在创建matcher对象
        Matcher matcher = pattern1.matcher(line);
        if (matcher.find()) {
            System.out.println("Found value: " + matcher.group(0));
            System.out.println("Found value: " + matcher.group(1));
            System.out.println("Found value: " + matcher.group(2));
            System.out.println("Found value: " + matcher.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
