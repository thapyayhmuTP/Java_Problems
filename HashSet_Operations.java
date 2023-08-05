package Java_Problems;
import java.util.*;
/**
 *
 * @author tph
 */
public class HashSet_Operations {
    public static void main(String[] args) {
        Set<String> s1=new HashSet<String>();
        s1.add("George");
        s1.add("Jim");
        s1.add(("John"));
        s1.add("Blake");
        s1.add("Kevin");
        s1.add("Michael");
        Set<String> s2=new HashSet<String>();
        s2.add("George");
        s2.add("Katie");
        s2.add("Kevin");
        s2.add("Michelle");
        s2.add("Ryan");
        
        //s1's values will be changed when the union or intersection occurs.
        //That's why clones are created
        Set<String> s1Clone1=new HashSet<String>(s1);
        Set<String> s1Clone2=new HashSet<String>(s1);
        Set<String> s2Clone1=new HashSet<String>(s2);
        Set<String> s2Clone2=new HashSet<String>(s2);
        
        System.out.println("After Union:");
        s1.addAll(s2);
        System.out.println(s1);
        System.out.println("After difference:");
        s1Clone1.removeAll(s2Clone1);
        System.out.println(s1Clone1);
        System.out.println("After intersetion:");
        s1Clone2.retainAll(s2Clone2);
        System.out.println(s1Clone2);
    }
    
}

/* 
ArrayList operations also work the same. The only difference is
List<String> list1=new ArrayList<String>();
*/
