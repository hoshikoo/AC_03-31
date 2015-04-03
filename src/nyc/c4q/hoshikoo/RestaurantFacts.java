package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/31/15.
 */
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RestaurantFacts {

    public static void main(String[] args) {
        // Step 1. Use FileParser's static method getLines() to get a nested
        //         ArrayList representing the CSV file.
        //
        //         For now, use "nyc-restaurants-small.csv".
        //
        //         Use a parameter to specify which column you're interested
        //         in. For now, use the int 14, which will give you the
        //         restaurant's grade.

        ArrayList <ArrayList <String>> listoflist = FileParser.getLines("/Users/Hoshiko/Desktop/accesscode/AC_03-31/src/nyc-restaurants-small.csv", 14);
        System.out.println(listoflist.size());
        // Step 2. Build a HashMap named "restaurants".
        //         Loop over every line and add the appropriate data to your
        //         HashMap.
        HashMap<String, String> restaurants = new HashMap<String, String>();
        for (ArrayList <String> line: listoflist){
            restaurants.put(line.get(1), line.get(0));
        }

        System.out.println(restaurants);
        // Step 3. Create a Scanner and prompt the user for a restaurant.
        //         If the restaurant has a relevant fact, print it. Otherwise
        //         print "Restaurant not found.".
        Scanner input =new Scanner(System.in);
        System.out.println("Please input the restaurant name:");
        String restaurantName = input.nextLine();

        //if (restaurantName.equalsIgnoreCase(restaurants.get(1))){
        //    System.out.println("we find the restaurant");
        //}
//        else {
//            System.out.println("Restaurant not found.");
//        }
    }
}