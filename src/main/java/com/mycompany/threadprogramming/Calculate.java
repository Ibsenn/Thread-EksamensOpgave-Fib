package com.mycompany.threadprogramming;

import java.util.concurrent.ArrayBlockingQueue;

public class Calculate
{
   
    public static ArrayBlockingQueue s2 = new ArrayBlockingQueue(11);
    
    public static void main(String[] args) throws InterruptedException
    {
        FibData fb = new FibData();
        
        fib f1 = new fib(Long.parseLong(String.valueOf(fb.s1.poll())));
        fib f2 = new fib(Long.parseLong(String.valueOf(fb.s1.poll())));
        fib f3 = new fib(Long.parseLong(String.valueOf(fb.s1.poll())));
        fib f4 = new fib(Long.parseLong(String.valueOf(fb.s1.poll())));
        f1.start();
        f2.start();
        f3.start();
        f4.start();
       
        for (int i = 0; i < s2.size(); i++)
        {
           System.out.println(s2.take());
        }
        
        
        
        
    }
}
