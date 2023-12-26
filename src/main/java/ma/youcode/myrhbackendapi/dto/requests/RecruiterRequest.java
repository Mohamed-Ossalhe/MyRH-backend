package ma.youcode.myrhbackendapi.dto.requests;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ma.youcode.myrhbackendapi.entities.Address;

@EqualsAndHashCode(callSuper = true)
@Data
public class RecruiterRequest extends UserRequest {
    private String password;

    private Address Address;
    private String image;
}
