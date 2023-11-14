package Student.Student.rep;
import Student.Student.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface studentRepoInt extends MongoRepository<Student, Integer> {

}
