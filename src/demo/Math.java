package demo;

public class Math implements Course {

	private physicalBook pb;
	public Math(physicalBook tpb) {
		pb = tpb;
	}
	@Override
	public String takeCourse() {
		// TODO Auto-generated method stub
		return "1 + 1";
	}

	@Override
	public String gettextbook() {
		// TODO Auto-generated method stub
		return pb.getbook();
	}

}
