package runnableinterface;

public class FirstThreadProgramAnonymousClass {
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println("thread exec: " + (i+1));
                }
            }
        };

        new Thread(obj).start();
        new Thread(obj).start();
    }
}
