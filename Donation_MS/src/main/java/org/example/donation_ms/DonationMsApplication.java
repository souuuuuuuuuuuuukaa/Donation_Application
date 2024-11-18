package org.example.donation_ms;

import org.example.donation_ms.entities.Donation;
import org.example.donation_ms.repository.DonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DonationMsApplication implements CommandLineRunner {
    @Autowired
    private DonationRepo donationRepo;
    public static void main(String[] args) {
        SpringApplication.run(DonationMsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        donationRepo.save(new Donation(4L, 1000.0, LocalDate.of(2024, 11, 19)));
        donationRepo.save(new Donation(6L, 1700.0, LocalDate.of(2024, 10, 17)));

    }
}
