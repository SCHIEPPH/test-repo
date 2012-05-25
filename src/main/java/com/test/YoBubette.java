package com.test;

/**
 * Created by
 * User: ralph
 * Date: 12/6/11
 * Time: 2:20 PM
 */
public class YoBubette

    public static String    YB = "Yo Bubette!!!";

    public  String  getMessage() {

        return YB;
    }

    public static void main(String[] args) {
        YoBubette     yb = new YoBubette();

        System.out.println(yb.getMessage());
    }
}
