package com.test;

/**
 * Created by
 * User: ralph
 * Date: 12/6/11
 * Time: 2:20 PM
 */
public class YoBubba {

    public static String    YB = "Yo Bubba!!!";

    public  String  getMessage() {

        return YB;
    }

    public static void main(String[] args) {
        YoBubba     yb = new YoBubba();

        System.out.println(yb.getMessage());
    }
}
