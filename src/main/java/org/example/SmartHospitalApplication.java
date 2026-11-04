package org.example;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
    public class SmartHospitalApplication {

        public static void main(String[] args) {
            SpringApplication.run(SmartHospitalApplication.class, args);
        }

        @Bean
        CommandLineRunner run(
                PatientAlertProcessor processor,
                HospitalConfiguration configuration) {

            return args -> {

                System.out.println("Hospital: " +
                        configuration.getHospitalName());

                processor.processRoutineAlert(
                        "P001",
                        "Your appointment is scheduled for tomorrow."
                );

                processor.processEmergencyAlert(
                        "P002",
                        "Critical ICU alert! Immediate attention required."
                );
            };
        }
    }

