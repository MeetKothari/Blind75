/* A sample project for me to practice storing only the even values
of an array into a hash set 
*/

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Object> hash = new HashSet<>();
        int intArray[];
        intArray = new int [20];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
            System.out.println(intArray[i]);

            if (hash.contains(i)){
                hash.stream().count();
            }

            else if (i % 2 == 0){
                hash.add(i);
            }

            System.out.println("This is the current hashset: " + hash);
        }


    }
}
