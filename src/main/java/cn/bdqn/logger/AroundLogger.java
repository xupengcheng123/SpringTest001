package cn.bdqn.logger;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class AroundLogger {
    public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("调用:"+jp.getTarget()+" 的"+jp.getSignature().getName()+" 方法.方法入参:"+ Arrays.toString(jp.getArgs()));
        try{
            Object result =jp.proceed();
            System.out.println("调用:"+jp.getTarget()+" 的"+jp.getSignature().getName()+" 方法.返回值："+ result);
            return  result;
        }
        catch (Throwable e){
            System.out.println(jp.getSignature().getName()+" 方法发生异常:"+e);
            throw e;
        }
        finally {
            System.out.println(jp.getSignature().getName()+" 方法结束执行");
        }

    }
}
