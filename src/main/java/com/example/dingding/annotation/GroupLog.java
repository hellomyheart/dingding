package com.example.dingding.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/27 17:37
 * description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GroupLog {
    //表示操作是哪个服务（模块）
    String module() default "xxx服务";
    //操作类型,添加、更新、删除
    String type() default "add";
    //操作者
    String user() default "system";
    //操作描述
    String operation() default "";
}
