package org.april.util;

import org.junit.Test;

import java.util.Properties;

/**
 * @Description: 工具类propUtil测试
 * @Author: Jingzeng Wang
 * @Date: Created in 11:02  2017/5/30.
 */
public class PropsUtilTest {
    @Test
    public void loadProps() throws Exception {
        Properties props = PropsUtil.loadProps("jdbc.properties");
        String driver = PropsUtil.getString(props, "db_name");
        System.out.println(driver);
        System.out.println("0");
    }

}