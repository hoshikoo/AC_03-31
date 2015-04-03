package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/31/15.
 */
import java.util.HashMap;

public class HashMethods {

    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<String, Integer>();

        stock.put("basketball", 3);
        stock.put("running shoes", 4);
        stock.put("jumping rope", 2);
        stock.put("power bars", 15);

        stock.get("jumping rope");

        // write a line of code that would up date the number of running shoes to 5
        stock.put("baseball", 1);

        //System.out.println(stock.size());
    }
}