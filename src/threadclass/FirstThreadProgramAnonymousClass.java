package threadclass;

public class FirstThreadProgramAnonymousClass {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
          public void run() {
              for(int i = 0; i < 5; i++) {
                  System.out.println("first thread: " + (i+1));
              }
          }
        };
        Thread t2 = new Thread() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("second thread: " + (i+1));
                }
            }
        };
        t1.start();
        t2.start();
    }
}
