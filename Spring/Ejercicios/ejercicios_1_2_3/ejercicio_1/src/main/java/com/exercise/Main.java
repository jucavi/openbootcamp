package com.exercise;

import com.exercise.entities.Saludo;
import com.exercise.services.NotificationService;
import com.exercise.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = context.getBean("saludo", Saludo.class);
        UserService notification = context.getBean("userService", UserService.class);

        saludo.imprimirSaludo();
        notification.imprimirSaludo();
    }
}
