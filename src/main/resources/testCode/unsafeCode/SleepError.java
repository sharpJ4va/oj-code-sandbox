/**
 * 无限睡眠（阻塞程序执行）
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final long ONE_HOUR = 60 * 60 * 1000L;
        Thread.sleep(ONE_HOUR);
        System.out.println("睡眠结束");
    }
}
