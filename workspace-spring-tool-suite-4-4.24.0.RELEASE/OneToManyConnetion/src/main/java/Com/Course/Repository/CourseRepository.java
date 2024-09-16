package Com.Course.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Com.CourseEntity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
