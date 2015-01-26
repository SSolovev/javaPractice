package practice.app.model;

/**
 * Created by SeASolovev on 01.12.2014.
 */
public class Child2 {
   public void testChildProtectedWithoutInheritance(){
       Parent2 p2 = new Parent2();
       p2.testProtectedWithoutInheritance();
   }
    public void testChildPackagePrivate(){
        Parent2 p2 = new Parent2();
        p2.testPackagePrivate();
    }

}
