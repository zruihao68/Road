import java.util.HashMap;
import java.util.Map;

/**
 * Created by zrui on 2016/7/3.
 */
public class XianChen implements Runnable {

    private static Map<String, Object> map;

    static {
        map = new HashMap<String, Object>();
        map.put("zrui0", "zrui0");
        map.put("zrui1", "zrui1");
        map.put("zrui2", "zrui2");
        map.put("zrui3", "zrui3");
        map.put("zrui4", "zrui4");
        map.put("zrui5", "zrui5");

    }

    public void run() {
        int i = 10000;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

    }


    public static void main(String[] args) {
        XianChen sc = new XianChen();

        Thread t1 = new Thread(sc);
        t1.start();

    }
}