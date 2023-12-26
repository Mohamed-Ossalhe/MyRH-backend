package ma.youcode.myrhbackendapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String region;
    private String district;
    private String city;
    private String street;
    private Integer postalCode;
}
