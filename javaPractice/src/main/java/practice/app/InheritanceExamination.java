package practice.app;

import practice.app.model.Child1;
import practice.app.model.Child2;
import practice.app.model.Electronic;

/**
 * Created by SeASolovev on 27.11.2014.
 */
public class InheritanceExamination {
    public static void main(String[] args) {

        Electronic e = new Electronic();

        Child1 c1 = new Child1();
        c1.testChildProtected();
        c1.testChildPackagePrivate();

        Child2 c2 = new Child2();
        c2.testChildPackagePrivate();
        c2.testChildProtectedWithoutInheritance();
    }
}
