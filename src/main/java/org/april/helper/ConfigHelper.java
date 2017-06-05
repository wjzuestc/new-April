package org.april.helper;

import org.april.ConfigConstant;
import org.april.util.PropsUtil;

import java.util.Properties;

/**
 * @Description: 配置操作文件助手
 * @Author: Jingzeng Wang
 * @Date: Created in 20:54  2017/6/5.
 */
public final class ConfigHelper {
    //加载项目配置文件
    private static final Properties properties = PropsUtil.loadProps(ConfigConstant.CONFIG_File);

    /**
     * 获取数据库驱动
     *
     * @return
     */
    public static String getJdbcDriver() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_DRIVER);
    }

    /**
     * 获得数据库连接
     *
     * @return
     */
    public static String getJdbcUrl() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_URL);
    }

    /**
     * 获得数据库名
     *
     * @return
     */
    public static String getJdbcUsername() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_USERNAME);
    }

    /**
     * 获得数据库密码
     *
     * @return
     */
    public static String getJdbcPaaword() {
        return PropsUtil.getString(properties, ConfigConstant.JDBC_PASSWORD);
    }

    /**
     * 获得基础包名
     *
     * @return
     */
    public static String getAppBasePath() {
        return PropsUtil.getString(properties, ConfigConstant.APP_BASE_PAKEAGE);
    }

    /**
     * 获得jsp页面基础路径，若配置文件不配置此项，则默认为webapp下的/WEB-INF/view/
     *
     * @return
     */
    public static String getAppJspPath() {
        return PropsUtil.getString(properties, ConfigConstant.APP_JSP_PATH, "/WEB-INF/view/");
    }

    /**
     * 获得应用静态资源路径
     *
     * @return
     */
    public static String getAppAssertPath() {
        return PropsUtil.getString(properties, ConfigConstant.APP_ASSERT_PATH, "assert");
    }

}
