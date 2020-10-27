package com.example.dingding.aop;

import com.example.dingding.annotation.GroupLog;
import com.example.dingding.vo.ResponseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.StringJoiner;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/27 17:44
 * description:
 */
@Aspect
@Component
public class GroupLogAspect {
    private ThreadLocal<SimpleDateFormat> format= ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    //切点表达式，表示加了DocumentLog注解的都是切点，路径是自定义注解的全路径
    @Pointcut("@annotation(com.example.dingding.annotation.GroupLog)")
    public void pointcut(){
    }
    @Around("@annotation(groupLog)")
    public ResponseResult groupLogAecord(ProceedingJoinPoint joinPoint, GroupLog groupLog) throws Throwable {
        //获取请求
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        //响应
        ResponseResult responseResult = null;
        try {
            responseResult = (ResponseResult<Object>) joinPoint.proceed();
            saveLog(joinPoint,groupLog,request);
        }
        catch (Exception e){
            saveLog(joinPoint,groupLog,request);
        }

        return responseResult;
    }

    private void saveLog(ProceedingJoinPoint joinPoint, GroupLog groupLog, HttpServletRequest request) {
        //记录参数
        StringJoiner contentJoiner = new StringJoiner(",");

        //获取所有参数
        Object[] allParam = joinPoint.getArgs();
        for (Object param : allParam) {
            contentJoiner.add(param.toString());
        }
        //创建实体类

        //写入数据库

        System.out.println(groupLog.module()+","+contentJoiner);
    }
}
