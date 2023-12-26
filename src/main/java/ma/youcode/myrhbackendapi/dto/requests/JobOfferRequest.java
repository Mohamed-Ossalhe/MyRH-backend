package ma.youcode.myrhbackendapi.dto.requests;

import lombok.Data;
import ma.youcode.myrhbackendapi.entities.Address;
import ma.youcode.myrhbackendapi.entities.Recruiter;
import ma.youcode.myrhbackendapi.enums.OfferStatus;

import java.util.UUID;

@Data
public class JobOfferRequest {
    private UUID id;
    private String title;
    private String description;
    private String profile;

    private Address address;
    private String educationalLevel;

    private double salary;

    private OfferStatus status;

    private Recruiter recruiter;
}
