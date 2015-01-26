package practice.app.model;

/**
 * Created by SeASolovev on 01.12.2014.
 */
public class Parent1 {
    private String constructor = "Parent1 constructor";

    public static final String F="F";

    public Parent1(){
        overridedMethod();
        System.out.println(constructor);
    }
    protected void testProtected(){
        System.out.println("Parent1 This is protected method " + F);
        print();
    }
    static void  print(){
        System.out.println("FF: " + F);
    }

    public void overridedMethod(){
        System.out.println("Parent1 overridedMethod");
    }
}
