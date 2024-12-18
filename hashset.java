
import java.util.*;
public class hashset{
    public static void main(String [] args){
    HashSet<Integer> set = new HashSet<>(Arrays.asList(34,45,81,19,16,2));
        int max = Collections.max(set);
        int min = Collections.min(set);
        System.out.println("Highet entry:" +max);
        System.out.println("Minimum entry:" +min);
        

    }
}




