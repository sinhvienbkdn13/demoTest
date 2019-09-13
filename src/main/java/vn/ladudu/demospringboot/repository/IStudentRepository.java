package vn.ladudu.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ladudu.demospringboot.model.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
