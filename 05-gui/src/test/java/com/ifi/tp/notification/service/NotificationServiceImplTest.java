package com.ifi.tp.notification.service;

import com.ifi.tp.notification.service.NotificationServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.jms.core.JmsTemplate;

import static org.mockito.Mockito.verify;

class NotificationServiceImplTest {

    @InjectMocks
    private NotificationServiceImpl notificationService;

    @Mock
    private JmsTemplate jmsTemplate;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void sendNotification_shouldCallTheJmsTemplate(){
        this.notificationService.sendNotification("test");

        verify(jmsTemplate).convertAndSend("notification", "test");
    }

}
