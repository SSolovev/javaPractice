package practice.app.model;

/**
 * Created by SeASolovev on 01.12.2014.
 */
public class Parent2 {
    void testPackagePrivate(){
        System.out.println("Parent2 This is package private!");
    }

    protected void testProtectedWithoutInheritance(){
        System.out.println("Parent2 This is protected method without inheritance");
    }
}
