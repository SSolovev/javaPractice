package practice.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SeASolovev on 09.02.2015.
 */
public class CompareCollections {
    static class Person{
        String name;
        String age;
    }
    public boolean compare(List<Person> p1, List<Person> p2){
        boolean isEqual = true;
        for (Person p : p1){
           if(!p2.contains(p)){
               isEqual=false;
           }
        }
        return isEqual;
    }

//    public void removeFromArrayList(ArrayList list, int elementsAmount, int startPosition){
//        for(int i = 0; i<list.size();i++){
//            list.
//
//        }
//
//    }
}
