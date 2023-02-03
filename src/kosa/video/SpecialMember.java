package kosa.video;

public class SpecialMember extends GeneralMember{
	private int point;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int point) {
		super(id, name, address);
		this.point = point;
	}

//	public void rentalVideo2(Video video){
//		super.rental(video);//부모에게 그 내용 전달
//		point += 10;
//	}
	
//	public void show2() {
//		super.show();
//		System.out.println("회원이 보너스 포인트 적립: " + point);
//	}

	
	@Override
	public void rental(Video video) {
		super.rental(video);
		point += 10;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("회원이 보너스 포인트 적립: " + point);
	}
	
	
	
	
	
	


}
