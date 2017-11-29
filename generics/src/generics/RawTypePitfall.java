package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Backward compatibility : raw types supported but compiler won't detect runtime errors.
 *
 * @author clement.trung
 */
public class RawTypePitfall {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");

        List rawList = stringList;  // warning: unchecked conversion
        rawList.add(1);             // warning: unchecked call
        
        List rawList2 = new ArrayList();
        rawList2.add(1);
        
        stringList = rawList2;
        
        

        System.out.println("rawList = " + rawList);

        for (String s : stringList) {
            System.out.println(s);  // runtime error on the 3rd item in the list
            // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        }
    }
}