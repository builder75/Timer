import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static boolean b = true;
    static long i = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (b) {
            System.out.println("wait in seconds");

            try {
                i = scanner.nextLong();
                b = false;
            } catch (Exception e) {
                System.out.println("wrong input");
                scanner.next();
            }
        }

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(i + " seconds over");
                System.exit(0);
            }

        };
        timer.schedule(timerTask, i * 1000);
    }
}
