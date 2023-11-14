package Student.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Student.Student.Model.Student;
import Student.Student.rep.studentRepoInt;

@RestController
public class Controller {
	
	@Autowired
	private studentRepoInt studentRepo; 
	
	
	
	@PostMapping("/adddata")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		Student save = this.studentRepo.save(student);
		return ResponseEntity.ok(save);
		
	}
	
	@GetMapping("/getdata")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(this.studentRepo.findAll());
	}
	
	@GetMapping("/getdatabyId/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {
        // Use the findById method to retrieve a student by ID
        // If the student is found, return it; otherwise, return a not found response
        return this.studentRepo.findById(id)
                .map(student -> ResponseEntity.ok(student))
                .orElse(ResponseEntity.notFound().build());
	}
	
	 @DeleteMapping("/delete/{id}")
	    public ResponseEntity<?> deleteStudentById(@PathVariable int id) {
	        if (this.studentRepo.existsById(id)) {
	            this.studentRepo.deleteById(id);
	            return ResponseEntity.ok("Student with ID " + id + " has been deleted.");
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }
     
}
	

