package org.april.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: Action 方法注解
 * @Author: Jingzeng Wang
 * @Date: Created in 22:25  2017/6/5.
 * @since: 1.0.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
    /**
     * 请求类型与方法
     * @return
     */
    String value();
}
