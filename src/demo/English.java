package demo;

public class English implements Course {

	private physicalBook pb;
	public English(physicalBook tpb) {
		pb = tpb;
	}
	@Override
	public String takeCourse() {
		// TODO Auto-generated method stub
		return "Apple";
	}

	@Override
	public String gettextbook() {
		// TODO Auto-generated method stub
		return pb.getbook();
	}

}
