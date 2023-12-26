package ma.youcode.myrhbackendapi.repositories;

import ma.youcode.myrhbackendapi.entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, UUID> {
}
