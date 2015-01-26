package practice.app;

import practice.app.model.Apple;
import practice.app.model.food.Fruit;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int i = 1 >> 2 + 11 - 2 - 11 << 1;
        System.out.println("i: "+i);
        regexpCheck();
    }

    private static void localeCheck(){
        Locale.setDefault(new Locale("en_US"));
        Locale locale = new Locale("ru","RU");
        Locale locale2 = new Locale("tu","RU");

        ResourceBundle rb = ResourceBundle.getBundle("Bundle", locale2);

        System.out.println(rb.getString("testKey"));
    }

    private static void inheritanceCheck(){
        System.out.println( "Hello World!!" );
        Apple a= new Apple();
        a.printFruit();
        Fruit b= new Apple();
        b.printFruit();
    }

    private static void regexpCheck(){
        String patternString="\\d*";
        String checkString="dw123 678sd 8 9432";
        Pattern p = Pattern.compile(patternString);
        Matcher m = p.matcher(checkString);
//        m.find();
//        m.matches();
        while(m.find()){
            System.out.println(m.start()+" "+m.group());
        }

    }

}