package Arrays;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class MyThread implements Runnable {
    int data  = 100;
    int counter = 1;
    synchronized public void run(){
        String tname = Thread.currentThread().getName();
        if(tname.equals("EVEN"))
        {
            evenPrint();
        }
        else
        {
            oddPrint();
        }
    }
    void evenPrint()
    {
        while(counter <= data)
        {
            if(counter % 2 == 0)
            {
                try{
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println("SOme issue");
                }
                
            }
            System.out.print(counter + " ");
            counter ++;
            try{
                Thread.sleep(200);
            }
            catch(Exception e) {
                System.out.println("SOME Issue");
            }
            notify();
        
        }
        
        
    }
    void oddPrint()
    {
    
        while(counter <= data)
        {
            if(counter % 2 != 0)
            {
                try{
                    wait();
                }
                catch(Exception e)
                {
                    System.out.println("SOme issue");
                }
                
            }
            System.out.print(counter + " ");
            counter ++;
            notify();
            try{
                Thread.sleep(200);
            }
            catch(Exception e) {
                System.out.println("SOME Issue");
            }
        }
        
    }
}
class HelloWorld {
    public static void main(String[] args) throws Exception {
        MyThread m1 = new MyThread();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        t1.setName("ODD");
        t2.setName("EVEN");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
