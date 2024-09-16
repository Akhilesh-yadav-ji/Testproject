package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Student.info.student;


@Repository
public interface Studentrepository extends JpaRepository<student,Long> {

}
