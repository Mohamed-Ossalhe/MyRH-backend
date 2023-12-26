package ma.youcode.myrhbackendapi.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String region;
    private String district;
    private String city;
    private String street;
    private Integer postalCode;
}
