public class HB {
    public static int count = 0;

    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{testThread.join();}catch (InterruptedException e){ e.printStackTrace();}
        System.out.println(count);
    }

    static class TestThread extends Thread {
        public void run(){
            count++;
        }
    }
}
