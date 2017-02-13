package com.common;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sunil
 */
public class Common {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        for(String item : list){
            System.out.println("ITEM : " + item);
        }
}
