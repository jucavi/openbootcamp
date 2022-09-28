package com.exercise.services;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public void imprimirSaludo() {
        System.out.println(" -> Hola desde la clase NotificationService");
    }
}
