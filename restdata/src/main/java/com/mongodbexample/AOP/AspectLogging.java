package com.mongodbexample.AOP;

import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectLogging {
    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(AspectLogging.class);

    @Before("execution(* com.mongodbexample.controller.*.*(..))")
    public void initialLog() {
        log.info("Before advice is called");
    }
}
