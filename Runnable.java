
public class Runnable implements java.lang.Runnable {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable();
        {
            for(int i=1; i<=5;i++)
            {
                System.out.println("Hi!!");
                try{Thread.sleep(10);}catch(InterruptedException e){    
                }
            }
        };

        Runnable obj2 = new Runnable();
        {
            for(int i=1; i<=5;i++)
            {
                System.out.println("Hello!!");
                try{Thread.sleep(10);}catch(InterruptedException e){    
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
