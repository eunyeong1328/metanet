package kosa.video;

public class VideoMain {
	public static void main(String[] args) {
		Video v1 = new Video("1","탑건2","톰크루즈");
		Video v2 = new Video("2","탑건3","셀레나 고메즈");
		
		//오브젝트는 최상위 컬렉트
		//오브젝트 형변환은 부모로 형변환이 가능하다
		GeneralMember arr[] = {
				new GeneralMember("aa","홍길동","송파"),
				new SpecialMember("bb","김철수","서울",0) //부모의 데이터 형변환 가능
		};
		
		//부모가 가지고 있는 형변환
		for(int i=0; i<arr.length; i++) {
			arr[i].rental(v1);
			arr[i].show();
		}
		
		
//		GeneralMember g = new GeneralMember("aa","홍길동","송파");
//		GeneralMember g1 = new GeneralMember("bb","김철수","서울");
//		
//		g.rental(v1);
//		g.show();
//		
//		g1.rental(v2);
//		g1.show();
		
//		SpecialMember s = new SpecialMember("aa","김철수","서울",0);
//		s.rentalVideo2(v2);
//		s.show2();
//		
		
		
	}

}

//댓글 기능 구현