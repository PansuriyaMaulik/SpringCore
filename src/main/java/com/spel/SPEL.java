package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SPEL {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spelconfig.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

        //Using Spring expression language api
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("3*6");
        System.out.println(expression.getValue());
    }
}
