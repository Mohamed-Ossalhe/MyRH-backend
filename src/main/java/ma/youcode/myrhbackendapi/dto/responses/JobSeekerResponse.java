package ma.youcode.myrhbackendapi.dto.responses;

import lombok.*;
import ma.youcode.myrhbackendapi.entities.Application;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeekerResponse extends UserResponse {
    private String identity;
    private String resume;

    private List<Application> applications;
}
