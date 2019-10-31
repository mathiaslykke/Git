import java.util.*;

/**
 * Smallest
 */
public class Smallest {

    public static void main(String[] args) {
        
        int smallest = new Random()
                        .ints(0,1000)
                        .limit(10)
                        .reduce(Integer.MAX_VALUE, (a,b)-> a < b );
    var a = 10;
    var b = 20;
    var c = 20;
    var d = 30;
    var e = 20;
    var f = 20;

    }
}