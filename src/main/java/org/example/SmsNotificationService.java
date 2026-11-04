package org.example;

import org.springframework.stereotype.Component;

@Component("smsServices")
public class SmsNotificationService implements NotificationService{
    @Override
    public void notificationService(String Patient_id, String message) {

    }

    @Override
    public void sendNotification(String patientId, String message) {

    }
}
