package threadPractice; public class threadjoin { public static void main(String args[]) throws InterruptedException { Thread thr1 = new Thread(new Runnable() { @Override public void run() { System.out.println("Hello"); } }); Thread thr2 = new Thread(new Runnable() { @Override public void run() { System.out.println("World!"); } }); thr1.start(); thr2.start(); thr1.join(); thr2.join(); System.out.println("End of Process!"); } }
}