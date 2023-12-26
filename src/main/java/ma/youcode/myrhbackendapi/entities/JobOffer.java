package ma.youcode.myrhbackendapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "joboffers")
public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private String profile;
    private String address; // TODO: replace string type with Address Object
    private String educationalLevel;
    @Column(nullable = true)
    private double salary;
    private String status; // TODO: replace string type with OfferStatus Enum
}
