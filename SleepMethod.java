public class MainClass {
    public static void main(String[] args) {
        A t1 = new A();
        B t2 = new B();

        t1.start(); 
        t2.start();  
    }
}
class A extends Thread{
    public void run(){
        for(int i =1;i<=5;i++){
            try{
                Thread.sleep(2000);
                System.out.println("Thread I "+i);
            } catch(Exception e){ }
    }
  }
}
class B extends Thread{
     public void run(){
           for(int j =1;j<=5;j++){
            try{
                Thread.sleep(2000);
                System.out.println("Thread J "+j);
            }
            catch(Exception e){ }
    
     }
   }
 }
