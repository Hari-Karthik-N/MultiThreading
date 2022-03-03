package threadclass;

public class FirstThreadProgram extends Thread {
    String name;
    FirstThreadProgram(String name) {
        this.name = name;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(this.name + " : thread execution: " + (i+1));
        }
    }

    public static void main(String[] args) {
        new FirstThreadProgram("First Thread").start();
        new FirstThreadProgram("Second Thread").start();

    }
}
