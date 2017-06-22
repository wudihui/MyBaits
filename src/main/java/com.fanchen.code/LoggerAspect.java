package com.fanchen.code;


import org.aspectj.lang.ProceedingJoinPoint;

class LoggerAspect{
    public void around1(ProceedingJoinPoint joinpoint) throws Throwable {
        System.out.println("aaaa");
        joinpoint.proceed();
        System.out.println("aaaa");
    }
    public void before1(){
        System.out.println("前置增强");
    }
    public void after1(){
        System.out.println("后置增强");
    }
}