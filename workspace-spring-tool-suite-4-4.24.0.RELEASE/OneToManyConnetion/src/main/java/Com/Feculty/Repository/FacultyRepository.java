package Com.Feculty.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.FecultyEntity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
