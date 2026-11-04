package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class PatientAlertProcessor {
    public void processEmergencyAlert(String p002, String s) {
    }

    public void processRoutineAlert(String p001, String s) {
    }

    @Component
    public class PatientAlertProcessors {

        @Autowired
        private NotificationService notificationService;

        @Autowired
        @Qualifier("emergencyServices")
        private NotificationService emergencyService;


        public void processRoutineAlert(String patientId, String message) {

            notificationService.sendNotification(patientId, message);

        }

        public void processEmergencyAlert(String patientId, String message) {

            emergencyService.sendNotification(patientId, message);

        }
    }
};
