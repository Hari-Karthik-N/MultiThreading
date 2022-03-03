package runnableinterface;

public class FirstThreadProgramAnonymousClass {
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("first thread: " + (i+1));
                }
            }
        };

        Runnable obj1 = new Runnable() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("second thread: " + (i+1));
                }
            }
        };

        new Thread(obj).start();
        new Thread(obj1).start();
    }
}
