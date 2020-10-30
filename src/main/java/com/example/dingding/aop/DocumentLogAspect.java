package com.example.dingding.aop;

import com.example.dingding.annotation.DingDingLog;
import com.example.dingding.entity.DocumentLog;
import com.example.dingding.mapper.DocumentLogMapper;
import com.example.dingding.vo.ResponseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringJoiner;

/**
 * @description
 * @className: DocumentLogAspect
 * @package: com.example.dingding.aop
 * @author: Stephen Shen
 * @date: 2020/10/30 下午2:57
 */
@Aspect
@Component
public class DocumentLogAspect {
    private ThreadLocal<SimpleDateFormat> format = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    @Autowired
    private DocumentLogMapper documentLogMapper;

    //切点表达式，表示加了DocumentLog注解的都是切点，路径是自定义注解的全路径
    @Pointcut("@annotation(com.example.dingding.annotation.DingDingLog)")
    public void pointcut() {
    }

    @Around("@annotation(dingDingLog)")
    public ResponseResult documentLogRecord(ProceedingJoinPoint joinPoint, DingDingLog dingDingLog) throws Throwable {
        //获取请求
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        //响应
        ResponseResult responseResult = null;

        try {
            responseResult = (ResponseResult<Object>) joinPoint.proceed();
            saveLog(joinPoint,dingDingLog,request);
        }
        catch (Exception e){
            saveLog(joinPoint,dingDingLog,request);
        }

        return responseResult;
    }

    private void saveLog(ProceedingJoinPoint joinPoint,DingDingLog dingDingLog,HttpServletRequest request){

        //记录参数
        StringJoiner contentJoiner = new StringJoiner(",");

        //获取所有参数
        Object[] allParam = joinPoint.getArgs();
        for (Object param : allParam) {
            contentJoiner.add(param.toString());
        }
        //创建实体类
        DocumentLog documentLog = new DocumentLog();

        documentLog.setUId(dingDingLog.user());
        documentLog.setLogType(dingDingLog.type());
        documentLog.setOperation(dingDingLog.operation());
        documentLog.setCreatetime(new Date());


        //写入数据库

        documentLogMapper.insert(documentLog);

    }


}
