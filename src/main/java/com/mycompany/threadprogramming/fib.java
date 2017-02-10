package com.mycompany.threadprogramming;

public class fib extends Thread
{ 
   private long res; 
    public fib(long n)
    {
      res = fibCalculate(n); 
    }
    
    private long fibCalculate(long n)
    {
        if ((n == 0) || (n == 1))
        {
            return n;
        } else
        {
            return fibCalculate(n - 1) + fibCalculate(n - 2);
        }
    }
    @Override
    public void run()
    {
          Calculate.s2.add(fibCalculate(res)); 
    }
}
