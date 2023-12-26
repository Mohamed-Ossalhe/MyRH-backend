package ma.youcode.myrhbackendapi.dto.requests;

import lombok.Data;

import java.util.UUID;

@Data
public class UserRequest {
    private UUID id;
    private String fullName;
    private String email;
    private String phoneNumber;
}
