package multiLevelHierarchy_pack;

public class Person {
     private String name;
     private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// Constructor with parameters
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Empty constructor
	public Person() {
		System.out.println("Inside Person Class");
	}
	
	//Constructor for cloning objects
	public Person(Person p) {
		age = p.age ;
		name = p.name ;
	}
	
	//String representation  for person instances
	@Override
	public String toString() {
		return "name=" + name + "*****age=" + age ;
	}
     
	public void getObjectType(){
		System.out.println("This is from Person Class");
	}
}
