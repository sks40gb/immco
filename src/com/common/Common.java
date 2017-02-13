package com.common;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sunil
 */
public class Common {

    public static void main(String[] args) {
    	List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        for(String item : list){
            System.out.println("ITEM : " + item);
        }

        for (int count = 0; count < 5; count++) {
            System.out.println("COUNT : " + count);
        }

    }
}
