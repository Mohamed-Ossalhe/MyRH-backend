package ma.youcode.myrhbackendapi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class VerificationCode {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String code;
    private LocalDateTime expiration;
}
