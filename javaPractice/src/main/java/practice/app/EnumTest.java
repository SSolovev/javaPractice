package practice.app;

/**
 * Created by SeASolovev on 27.11.2014.
 */
enum Animals{
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s){ sound = s;}
}
public class EnumTest {
    static Animals a;
    public static void main(String[] args){
        System.out.println(a.DOG.sound + " " + a.FISH.sound);

    }
}
