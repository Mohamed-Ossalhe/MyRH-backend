package ma.youcode.myrhbackendapi.dto.responses;

import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import ma.youcode.myrhbackendapi.entities.Address;
import ma.youcode.myrhbackendapi.entities.JobOffer;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecruiterResponse extends UserResponse {
    private String password;

    private Address Address;
    private String image;

    private List<JobOffer> jobOffers;
}
