package ma.youcode.myrhbackendapi.dto.responses;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgentResponse extends UserResponse {
    private String password;
}
