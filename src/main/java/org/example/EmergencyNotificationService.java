package org.example;

import org.springframework.stereotype.Component;

@Component("emergencyServices")
public class EmergencyNotificationService implements NotificationService{
    @Override
    public void notificationService(String student_id, String message) {
        System.out.println("studentID is "+ student_id + "");
    }

    @Override
    public void sendNotification(String patientId, String message) {

    }
}
