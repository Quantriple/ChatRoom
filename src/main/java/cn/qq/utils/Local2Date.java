package cn.qq.utils;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Administrator on 2019/5/15.
 */
public class Local2Date {
    private static final LocalDateTime time = LocalDateTime.now();

    public static String Local2Date() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        final String format = time.format(dtf);
        return format;
    }

    @Test
    public void test() {
        System.out.println(Local2Date());

    }
}
