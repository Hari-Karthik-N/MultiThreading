package runnableinterface;

public class FirstThreadProgram implements Runnable{
    String name;
    FirstThreadProgram(String name) {
        this.name = name;
    }
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(this.name + " : " + (i+1));
        }
    }
    public static void main(String[] args) {
        new Thread(new FirstThreadProgram("First Thread")).start();
        new Thread(new FirstThreadProgram("Second Thread")).start();
    }
}
