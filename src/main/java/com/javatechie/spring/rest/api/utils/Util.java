package com.javatechie.spring.rest.api.utils;

public class Util {

    public static Boolean validateProperty(String property){
        return System.getProperty(property) == null ? false:true;
    }
}
