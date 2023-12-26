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
public class Application {
    @EmbeddedId
    private UUID id; // TODO: replace UUID type with embedded id
    @Column(name = "motivationletter")
    private String motivationLetter;

    @ManyToOne
    @MapsId("jobSeekerId")
    @JoinColumn(name = "jobSeeker_id")
    private JobSeeker jobSeeker;

    @ManyToOne
    @MapsId("jobOfferId")
    @JoinColumn(name = "jobOffer_id")
    private JobOffer jobOffer;
}
