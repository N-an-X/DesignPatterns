package Flyweight;

import java.util.HashMap;

public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap<>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "----建立对象，并将其放入到对象池中。");
            result = new SignInfo4Poll(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "----直接从池中获得");
        }
        return result;
    }
}
