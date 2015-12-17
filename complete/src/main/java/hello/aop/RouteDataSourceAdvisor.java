package hello.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by jiming.liu on 2015/12/17.
 */
@Component
@Aspect
public class RouteDataSourceAdvisor {

    // 只对*Service类里标注了@RoutingDataSource 注解方法 进行AOP
//    @Pointcut("execution(@hello.aop.Tts2 * hello.service..*Service+.*(..))")
    @Pointcut("execution(* hello.service..*Service+.*(..))")
    private void routingDataSource(){}

    @Around("routingDataSource()")
    public Object routing(ProceedingJoinPoint joinPoint) throws Exception {

        String name = joinPoint.getClass().getName();
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
