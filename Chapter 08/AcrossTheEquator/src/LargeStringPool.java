import java.util.ArrayList;
import java.util.List;

public class LargeStringPool {

    public static void main(String args[]) throws InterruptedException {
        Long start = System.currentTimeMillis();
        List<String> strings = new ArrayList<>();
        for (Integer i = 1; i < 10000000; i++) {
            String s = i.toString().intern();
            strings.add(s);
        };
        Long end = System.currentTimeMillis();
        System.out.println("Elapsed time " + ( end - start) + " ms" );
        Thread.sleep(5000);
    }
}
