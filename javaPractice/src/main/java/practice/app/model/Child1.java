package practice.app.model;

import java.io.Serializable;

/**
 * Created by SeASolovev on 01.12.2014.
 */
public class Child1 extends Parent1 implements Serializable{
    private String constructor = "Child1 constructor";

    public Child1() {
//        super();
        overridedMethod();
    }

    public void testChildProtected(){
        testProtected();
    }

    public void testChildPackagePrivate(){
        Parent2 p2 = new Parent2();
        p2.testPackagePrivate();

    }

    public void overridedMethod(){
        System.out.println("Child1 overridedMethod");
    }
}
