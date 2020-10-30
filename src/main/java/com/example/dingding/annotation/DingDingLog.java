package com.example.dingding.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DingDingLog {
//    //表示操作是哪个服务（模块）
//    String module() default "xxx服务";

    /**
     * add update delete
     * @return
     */
    String type() default "add";

    //操作者id
    int user() default 1;

    //操作描述
    String operation() default "";
}
