package com.example.dingding.aop;

import com.alibaba.fastjson.JSON;
import com.example.dingding.annotation.DocumentLog;
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
 * @description
 * @className: DocumentLogAspect
 * @package: com.example.dingding.aop
 * @author: Stephen Shen
 * @date: 2020/10/27 下午3:53
 */
@Aspect
@Component
public class DocumentLogAspect {
    private ThreadLocal<SimpleDateFormat> format = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    //切点表达式，表示加了DocumentLog注解的都是切点，路径是自定义注解的全路径
    @Pointcut("@annotation(com.example.dingding.annotation.DocumentLog)")
    public void pointcut() {
    }

    @Around("@annotation(documentLog)")
    public ResponseResult documentLogRecord(ProceedingJoinPoint joinPoint, DocumentLog documentLog) throws Throwable {
        //获取请求
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        //响应
        ResponseResult responseResult = null;

        try {
            responseResult = (ResponseResult<Object>) joinPoint.proceed();
            saveLog(joinPoint,documentLog,request);
        }
        catch (Exception e){
            saveLog(joinPoint,documentLog,request);
        }

        return responseResult;
    }

    private void saveLog(ProceedingJoinPoint joinPoint,DocumentLog documentLog,HttpServletRequest request){

        //记录参数
        StringJoiner contentJoiner = new StringJoiner(",");

        //获取所有参数
        Object[] allParam = joinPoint.getArgs();
        for (Object param : allParam) {
            contentJoiner.add(param.toString());
        }
        //创建实体类

        //写入数据库

        System.out.println(documentLog.module()+","+contentJoiner);


    }



}
