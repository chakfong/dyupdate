package com.example.dyupdate.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ProcessingTimeAop {

    @Pointcut(value = "execution(* com.example.dyupdate.web..*.*(..))")
    public void aop() {

    }

    @Around("aop()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        long start = System.currentTimeMillis();
        result = joinPoint.proceed();
        long elapsed = System.currentTimeMillis() - start;
        log.info("[API:{}] Elapsed time: {}ms ", joinPoint.getSignature().getName(), elapsed);
        return result;
    }
}
