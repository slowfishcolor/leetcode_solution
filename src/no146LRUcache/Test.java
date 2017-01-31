package no146LRUcache;

import java.util.Scanner;

/**
 * Created by Prophet on 2016/12/3.
 */
public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cache capacity:");
        int capacity = Integer.parseInt(sc.nextLine());
        LRUCache cache = new LRUCache(capacity);



        System.out.println("type \"exit\" to quit");
        System.out.println("format: set(key,value) get(key)");


        while(true) {
            String input = sc.nextLine();
            if (input.equals("exit")) break;
            if(input.contains("set")) {
                int left = input.indexOf("(");
                int right = input.indexOf(")");
                String subString = input.substring(left + 1, right);
                String[] strings = subString.split(",");
                int key = Integer.parseInt(strings[0]);
                int value = Integer.parseInt(strings[1]);
                //System.out.println(key);System.out.println(value);
                cache.set(key, value);

            }
            else if (input.contains("get")) {
                int left = input.indexOf("(");
                int right = input.indexOf(")");
                String subString = input.substring(left + 1, right);
                int key = Integer.parseInt(subString);
                //System.out.println(key);
                int value = cache.get(key);
                System.out.println(value);
            }
        }

    }


}
