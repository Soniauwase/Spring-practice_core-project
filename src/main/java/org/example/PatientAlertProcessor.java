package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PatientAlertProcessor {
    @Autowired
    private NotificationService notificationService;
    private EmergencyNotificationService emergencyNotificationService;

    public void send(String patient_id, String message){
        notificationService.sendNotification(patient_id,message);

    }


}
