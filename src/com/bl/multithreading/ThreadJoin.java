package com.bl.multithreading;

public class ThreadJoin extends Thread{   
    public  void run()  
    {    
        for(int i=1; i<=4; i++)  
        {    
            try 
            {    
                Thread.sleep(500);    
            }catch(Exception e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {   
    	ThreadJoin thread1 = new ThreadJoin();    
    	ThreadJoin thread2 = new ThreadJoin();    
    	ThreadJoin thread3 = new ThreadJoin();    
        thread1.start();   
       try 
        {    
        thread1.join();    
        }catch(Exception e){System.out.println(e);}    
        thread2.start();   
        thread3.start();    
    }    
}
