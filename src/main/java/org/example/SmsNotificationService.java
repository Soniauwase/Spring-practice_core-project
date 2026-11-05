package org.example;

import org.example.NotificationService;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {
    @Override
    public void sendNotification(String patientId, String message) {
        System.out.println("SMS NOTIFICATION"+ patientId + ","+ message);
    }
}