package org.example.donation_ms.controller;

import org.example.donation_ms.entities.Donation;
import org.example.donation_ms.repository.DonationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Donation")
public class DonationController {
    @Autowired
    private DonationRepo donationRepo;

    @GetMapping("/listDonation")
    public List<Donation> getAllDonation(){return donationRepo.findAll();}

}
