package org.example.org_ms.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.donation_ms.entities.Donation;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Donation> donations;
}
