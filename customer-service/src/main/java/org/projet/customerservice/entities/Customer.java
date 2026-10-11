package org.projet.customerservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Locale;

@Entity
@Builder
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;

}
