package multiLevelHierarchy_pack;

public class Patient extends Person{

	private String disease;
	
	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Patient() {
		super();
		System.out.println("Inside Patient Class");
	}

  // Constructor with fields
	public Patient(String name, int age, String disease) {
		super(name, age);
		this.disease = disease;
	}
	
	public Patient(Patient pt) {
		super(pt);
		disease = pt.disease;
	}

	@Override
	public String toString() {
		return super.toString()+ "****" + " disease=" + disease;
	}
	
	public void getObjectType(){
		System.out.println("This is from Patient Class");
	}
}
