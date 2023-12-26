package ma.youcode.myrhbackendapi.dto.requests;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class JobSeekerRequest extends UserRequest {
    private String identity;
    private String resume;
}
