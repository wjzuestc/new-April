package org.april.util;

import org.apache.commons.lang.StringUtils;

/**
 * @Description: 数据类型转换工具类
 * @Author: Jingzeng Wang
 * @Date: Created in 10:32  2017/5/30.
 * @since 1.0.0
 */
public class CastUtil {

    /**
     * 对象转为String类型(提供默认类型)
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }

    /**
     * 转为String(默认值为"")
     */
    private static String castString(Object obj, String defalutValue) {
        return obj != null ? String.valueOf(obj) : defalutValue;
    }

    /**
     * 对象转为double类型(提供默认类型)
     */
    public static double castDouble(Object obj) {
        return castDouble(obj, 0);
    }

    /**
     * 转为double(默认值为0)
     */
    private static double castDouble(Object obj, double defalutValue) {
        double doubleValue = defalutValue;
        if (obj != null) {
            String strValue = String.valueOf(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    //转换可能会出现异常，要进行捕获
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defalutValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 对象转为Long类型(提供默认类型)
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    /**
     * 转为Long(默认值为0)
     */
    private static long castLong(Object obj, long defalutValue) {
        Long longValue = defalutValue;
        if (obj != null) {
            String strValue = String.valueOf(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    //转换可能会出现异常，要进行捕获
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defalutValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 对象转为int类型(提供默认类型)
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转为int(默认值为0)
     */
    private static int castInt(Object obj, int defalutValue) {
        int intValue = defalutValue;
        if (obj != null) {
            String strValue = String.valueOf(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    //转换可能会出现异常，要进行捕获
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defalutValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean类型
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转为boolean类型。默认为false
     */
    private static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if (obj != null) {
            //解析字符串为boolean。字符串true，解析后为布尔值ture。忽略大小写。其他为false
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
