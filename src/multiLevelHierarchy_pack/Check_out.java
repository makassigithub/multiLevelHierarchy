package multiLevelHierarchy_pack;

public class  Check_out extends Patient {

	private int duration_day;
	
	public int getDuration_day() {
		return duration_day;
	}

	public void setDuration_day(int duration_day) {
		this.duration_day = duration_day;
	}
	
	public Check_out (){
	       super();
	       System.out.println("Inside Checck_out class");
		}

	public Check_out (Check_out ch){
       super(ch);
       this.duration_day = ch.duration_day;
	}
	
	public Check_out (String name, int age, String disease, int duration_day){
	       super(name,age,disease);
	       this.duration_day = duration_day;
		}
	@Override
	public String toString() {
		return super.toString()+ "****" + "dutarion=" + duration_day + " days";
	}
	
	public void getObjectType(){
		System.out.println("This is from Check_out Class");
	}

}
