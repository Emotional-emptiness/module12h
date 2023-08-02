public class Main {
    public static void main(String[] args) {

        Thread timeThread = new Thread(() -> {
            int seconds = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                    seconds++;
                    System.out.println("Час: " + seconds + " сек");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        timeThread.start();


        Thread messageThread = new Thread(() -> {
            int seconds = 0;
            while (true) {
                try {
                    Thread.sleep(5000);
                    seconds += 5;
                    System.out.println("Минуло 5 секунд");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        messageThread.start();


        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timeThread.interrupt();
        messageThread.interrupt();
    }
}


