package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/31/15.
 */

import java.util.HashMap;
import java.util.Scanner;

public class WordTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        Scanner input = new Scanner (System.in);
        boolean addMode = true;

        System.out.println("Please give me some words:");

        while(true){
            String userInput = input.nextLine();

            if(userInput.equalsIgnoreCase("stop")){
                break;
            }

            else if(userInput.equalsIgnoreCase("rm")) {
                addMode = false;
                continue;

            }else if(userInput.equalsIgnoreCase("clr")){
                words.clear();
                continue;
            }

            if (addMode){
                words.put(userInput, 1);
            }else {
                words.remove(userInput);
            }
        }

        System.out.println("Thanks!");

        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words);
        System.out.println("Thanks! You have given me "+words.size() + " word(s)!");

        if (words.size()==0){
            System.out.println("Words is empty.");
        }

        //System.out.println(words.keySet());
        for (String name: words.keySet()) {
            System.out.println(name + ": " + words.get(name));
        }

    }




}
