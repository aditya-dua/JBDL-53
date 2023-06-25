package l8_introduction_AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Log {
	@Pointcut("execution(* l8_introduction_AOP.*.*(..))")
	   private void selectAll(){}

	   /** 
	      * This is the method which I would like to execute
	      * before a selected method execution.
	   */
	   @Before("selectAll()")
	   public void beforeAdvice(){
	      System.out.println("Going to setup student profile.");
	   }

	   /** 
	      * This is the method which I would like to execute
	      * after a selected method execution.
	   */
	   @After("selectAll()")
	   public void afterAdvice(){
	      System.out.println("Student profile has been setup.");
	   }

	   /** 
	      * This is the method which I would like to execute
	      * when any method returns.
	   */
	   @AfterReturning(pointcut = "selectAll()", returning = "retVal")
	   public void afterReturningAdvice(Object retVal){
	      System.out.println("Returning:" + retVal.toString() );
	   }

	   /**
	      * This is the method which I would like to execute
	      * if there is an exception raised by any method.
	   */
	   @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	   public void AfterThrowingAdvice(IllegalArgumentException ex){
	      System.out.println("There has been an exception: " + ex.toString());   
	   }

}
