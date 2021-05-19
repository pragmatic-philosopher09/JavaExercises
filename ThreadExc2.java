package threadPractice; 
public class threadWait 
{ 
  public static void main(String args[]) throws InterruptedException { 
    acc priyanshu = new acc(2000); 
    Thread thr1 = new Thread(new Runnable() 
     { 
       @Override 
       public void run() { 
         for (int i = 1; i <= 3; i++) { 
           try { 
             priyanshu.withdraw(30000); } 
           catch (InterruptedException e) { 
             e.printStackTrace(); } 
         }
       }
     }); 
    Thread thr2 = new Thread(new Runnable() { 
      @Override public void run() { 
        for (int i = 1; i <= 3; i++) { 
          priyanshu.deposit(40000); 
        }
      }
    });
    thr1.start();
    thr2.start();
    thr1.join();
    thr2.join();
    System.out.println(priyanshu.balance); 
  }
  } class acc {
  int balance; 
  public acc(int balance) {
    super(); 
    this.balance = balance;
  }
  public synchronized void withdraw(int withdraw_amount) throws InterruptedException
  { 
    System.out.println("THIS IS WITHDRAWAL! "+Thread.currentThread().getId()); 
    while(withdraw_amount>balance)
    { 
      System.out.println("THREAD IS WAITING!"); 
      wait();
    } 
    System.out.println("WITHDRAWAL HAPPENING !"+Thread.currentThread().getId()); 
    this.balance = this.balance - withdraw_amount; 
  }
  public synchronized void deposit(int dep_amount) { 
    System.out.println("THIS IS DEPOSIT! "+Thread.currentThread().getId()); 
    this.balance =this.balance+dep_amount;
    System.out.println("NOTIFYING! "+Thread.currentThread().getId()); notify(); 
  }
}
