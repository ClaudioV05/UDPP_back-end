package com.udpp.app.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

/// AOP Aspect-Oriented Programming.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@Aspect
@Configuration
public class AspectConfig {

    @Before("execution(* com.udpp.app.adapter.generator.output.udppparameter.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(">>> Logging before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.example..*(..))")
    public void logAfter() {
        System.out.println("After method runs");
    }

    @Around("@annotation(com.udpp.app.domain.entity.Log)")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println(">>> Starting: " + methodName);

        long start = System.currentTimeMillis(); // Start time
        Object result = joinPoint.proceed();     // Execute method
        long end = System.currentTimeMillis();   // End time

        long duration = end - start;
        System.out.println("<<< Finished: " + methodName + " in " + duration + " ms");
        return result;
    }
}