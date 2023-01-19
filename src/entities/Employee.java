package entities;

public class Employee {
	
	private String name;
	private Integer age;
	private Integer id;
	private Integer acessLevel = 1;
	
	// #Constructor
	public Employee(String name, Integer age, Integer id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	// #Class methods
	public void acessLevel() {
		System.out.println(acessLevel);
	}
	
	
	// #GET/SET methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
