package com.nagarro.springmvc.psbankapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class PSBankLoggingAspect {
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.nagarro.springmvc.psbankapp.controllers.*.*(..))")
	private void forControlerPackage() {
		
	}
	@Pointcut("execution(* com.nagarro.springmvc.psbankapp.controllers.*.*(..))")
	private void forServicesPackage() {
		
	}
	@Pointcut("execution(* com.nagarro.springmvc.psbankapp.controllers.*.*(..))")
	private void forDAOPackage() {
		
	}
	@Pointcut("forControlerPackage() || forServicesPackage() || forDAOPackage()")
	private void forApplication() {
		
	}
	
	@Before("forApplication()")
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		logger.info("Information: in @Before Advice: Calling the Method : " + methodName);
	}
	
	@AfterReturning(pointcut="forApplication()",returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().toShortString();
		logger.info("Information: in @AfterReturning Advice: from Method :" + methodName);
		logger.info("Information: Data Returned by Method :" + result);
	}
}
