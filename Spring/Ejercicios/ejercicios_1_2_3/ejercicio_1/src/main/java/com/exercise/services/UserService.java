package com.exercise.services;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void imprimirSaludo() {
        System.out.println("Invocando método imprimirSaludo de la clase NotificationService");
        notificationService.imprimirSaludo();
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
