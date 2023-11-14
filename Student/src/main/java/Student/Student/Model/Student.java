package Student.Student.Model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Data")
public class Student {
	private int id;
	private String name;
	private String city;
	private String mobileno;
	public Student(int id, String name, String city, String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobileno=mobileno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileno;
	}
	public void setMobileNo(String mobileno) {
		this.mobileno = mobileno;
	}
	
	
}
