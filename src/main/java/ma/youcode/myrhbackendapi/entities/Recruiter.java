package ma.youcode.myrhbackendapi.entities;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Recruiter extends User {
    private String password;
    private String Address; // TODO: replace string type with Address object
    private String image;
    // TODO: Add jobOffer relation here
}
