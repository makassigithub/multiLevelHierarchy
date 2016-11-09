package multiLevelHierarchy_pack;

public class Test_class {

	public Test_class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create 3 objects using different constructors
		
		//Constructor that takes all the parameters
		Check_out ch1 = new Check_out("Jon",34,"malaria",6);
		
		//Constructor that takes no parameter, we must programmatically set the fields
		System.out.println("******The order in which super is called*****");
		Check_out ch2 = new Check_out();
		ch2.setName("Pierro");
		ch2.setAge(23);
		ch2.setDisease("fever");
		ch2.setDuration_day(13);
		
		//Constructor that will clone ch1
		Check_out ch3 = new Check_out(ch1);
        
		// Now let's print the objects.
		
		
		System.out.print("ch1: ");System.out.println(ch1);
		System.out.print("ch2: ");System.out.println(ch2);
		System.out.print("ch3: ");System.out.println(ch3);
		
		// let's confirm the type of ch2
		System.out.print("ch2: "); 
		ch2.getObjectType();
		
	}
	
	/* THE OUTPUT OF THE PROGRAM
	 ******The order in which super is called*****
Inside Person Class
Inside Patient Class
Inside Checck_out class
ch1: name=Jon*****age=34**** disease=malaria****dutarion=6 days
ch2: name=Pierro*****age=23**** disease=fever****dutarion=13 days
ch3: name=Jon*****age=34**** disease=malaria****dutarion=6 days
ch2: This is from Check_out Class
	 */

}
