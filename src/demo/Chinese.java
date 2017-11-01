package demo;

public class Chinese implements Course {

	private physicalBook pb;
	public Chinese() {
		System.out.println("no arg constructor");
	}
	
	//setter method will be called by spring, used in setter dependence injection
	 public void setPb(physicalBook pb) {
		System.out.println("inside setter injection");
		 this.pb = pb;
	}


	@Override
	public String takeCourse() {
		// TODO Auto-generated method stub
		return "aoe";
	}

	@Override
	public String gettextbook() {
		// TODO Auto-generated method stub
		return pb.getbook();
	}
	
	//literal injection
	private String teacher;
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getTeacher() {
		return teacher;
	}
	
	 

}
