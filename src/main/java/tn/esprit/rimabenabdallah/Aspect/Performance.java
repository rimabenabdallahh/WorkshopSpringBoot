package tn.esprit.rimabenabdallah.Aspect;

import org.aspectj.lang.annotation.Around;

public class Performance {
    @Around("execution(* tn.esprit.spring.service.*.*(..))")
}
