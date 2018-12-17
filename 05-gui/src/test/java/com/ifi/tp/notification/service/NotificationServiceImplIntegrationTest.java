package com.ifi.tp.notification.service;

import com.ifi.tp.trainers.bo.Trainer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {Trainer.class})
class NotificationServiceImplIntegrationTest {

    @Test
    void sendNotification(@Autowired NotificationService notificationService) {
        notificationService.sendNotification("test !");
    }



}