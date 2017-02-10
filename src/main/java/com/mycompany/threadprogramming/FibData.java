package com.mycompany.threadprogramming;

import java.util.concurrent.ArrayBlockingQueue;

public class FibData
{
    
    ArrayBlockingQueue s1 = new ArrayBlockingQueue(11);
    
    public FibData()
    {
        s1.add(4);
        s1.add(5);
        s1.add(8);
        s1.add(12);
        s1.add(21);
        s1.add(22);
        s1.add(34);
        s1.add(35);
        s1.add(36);
        s1.add(37);
        s1.add(42);
    }
    
}
