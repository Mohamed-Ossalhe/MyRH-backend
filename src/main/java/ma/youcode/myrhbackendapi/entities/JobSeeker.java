package ma.youcode.myrhbackendapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobseekers")
public class JobSeeker extends User {
    @Column(name = "identity_num",nullable = false, unique = true)
    private String identity;
    private String resume;
}
