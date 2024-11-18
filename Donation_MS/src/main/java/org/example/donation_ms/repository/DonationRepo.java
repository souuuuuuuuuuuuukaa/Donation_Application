package org.example.donation_ms.repository;

import org.example.donation_ms.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepo extends JpaRepository<Donation,Long> {
}
