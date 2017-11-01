package demo;

public class English implements Course {

	private physicalBook pb;
	public English(physicalBook tpb) {
		pb = tpb;
	}
	@Override
	public String takeCourse() {
		return "Apple";
	}

	@Override
	public String gettextbook() {
		return "change a library" + pb.getbook();
	}
	
	//add an init method
	public void mystartup() {
		System.out.println("my start up method.");
	}
	
	//add a destroy method
	public void mycleanup() {
		System.out.println("my clean up method.");
	}

}
