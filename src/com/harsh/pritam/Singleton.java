package com.harsh.pritam;

public class Singleton{
    private static final Singleton INSTANCE = new Singleton();
 
    private Singleton(){ }

    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void show(){
        System.out.println("Singleon using static initialization in Java");
    }
}

//Read more: http://javarevisited.blogspot.com/2012/12/how-to-create-thread-safe-singleton-in-java-example.html#ixzz31K1gSmKt

//public static Singleton getInstance(){
//    if(_INSTANCE == null){
//        synchronized(Singleton.class){
//        //double checked locking - because second check of Singleton instance with lock
//               if(_INSTANCE == null){
//                   _INSTANCE = new Singleton();
//               }
//           }
//        }
//    return _INSTANCE;
//}
//
//Read more: http://javarevisited.blogspot.com/2011/03/10-interview-questions-on-singleton.html#ixzz31K2hx3b9