package org.example;
public class EmergencyNotificationService implements NotificationService {
    @Override
    public void sendNotification(String patientId, String message) {
        System.out.println("Emergency Notification"+ patientId + ","+ message);
    }
}