package com.practise.designpatterns.creational.singleton;

public class Singleton {

    //Rule 1 : - private constructor to restrict instantiation of the class from other classes
    private Singleton(){

    }

    //Rule 2 : - private static variable of the same class that is the only instance of the class
    private static Singleton singletonInstance;


    // Eagar Initialization
    private static Singleton eagarSingletonInstance = new Singleton();


    //static block initialization for exception handling
    static{
        try{
            singletonInstance = new Singleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }


    //Rule 3 :- public static method that returns the instance of the class
    //this is the global access point for outer world to get the instance of the singleton class.
    public static Singleton getSingletonInstance(){


        //lazy initialization
        if(singletonInstance == null){

            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }


}
