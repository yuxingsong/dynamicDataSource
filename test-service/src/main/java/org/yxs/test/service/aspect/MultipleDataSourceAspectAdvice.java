package org.yxs.test.service.aspect;

import org.yxs.test.datasourceswitch.MultipleDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component
@Aspect
public class MultipleDataSourceAspectAdvice {

    @Around("execution(* org.yxs.test.service.*.*(*))")
    public Object doAround1(ProceedingJoinPoint jp) throws Throwable {
        HttpServletRequest request =((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        HttpSession session =request.getSession();
        String dataSource= (String) session.getAttribute("ds");
        System.out.println("-========================================================"+session.getAttribute("ds"));
        if("QJS".equals(dataSource)){
            MultipleDataSource.setThreadLocalDatasource("dsone");
        }else {
            MultipleDataSource.setThreadLocalDatasource("dstwo");

        }
        return jp.proceed();
    }

}