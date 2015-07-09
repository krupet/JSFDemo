package ua.com.krupet.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import ua.com.krupet.person.Person;

/**
 * Created by krupet on 09.07.2015.
 */
@Aspect
public class PersonServiceAspect {

    @Around("execution(* ua.com.krupet.person.dao.impl.PersonServiceImpl.addPerson(*))")
    public Object getPersonServiceAround(ProceedingJoinPoint joinPoint) {

        System.out.println("Aspect!");

        Object[] args = joinPoint.getArgs();
        Person person = (Person) args[0];
        System.out.println("name is: " + person.getName());

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return null;
    }
}
