
package realestatemls;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Christopher
 */
public class RealEstateMLS {

    public static void main(String[] args) {
    
        /* This program is used to demonstrate ArrayLists using 
           the Property class as the source of a our objects.
        */
        
        ArrayList <Property> mls = new ArrayList <Property>();
      
        Property p1 = new Property(1000, "Land", 3.5);
        mls.add(p1);
        
        p1 = new Property(230000, "Estate", 2.0, 2, 3);
        mls.add(p1);
        
        p1 = new Property(300000, "Estate 2", 3.0, 4, 2);
        mls.add(p1);
             
        System.out.println(mls.toString());
        
        mls.remove(2);
        System.out.println(mls.toString());
        
        
    }
    
}
