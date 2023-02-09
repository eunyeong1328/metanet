package kosa.hotel;


public class Employee {
	
	//숙박비 수납
	public Bill calRoom(HotelSystem hotelsystem,int payMoney,Room curRoom) {
		System.out.println("고객님께서 지불하셔야 되는 금액은 " + payMoney + " 원 입니다.");
		Bill bill = new Bill();
		Client client = new Client();
		//Money a = client.calRoom(hotelsystem,payMoney,curRoom);
		//돈으로 영수증 만들기
		client.calRoom(hotelsystem, payMoney, curRoom);
		return bill;
	}
	
	//영수증 발급
	public void payBill(HotelSystem hotelsystem, Client client) {
		Bill bill = new Bill();
		System.out.println("예약 담당자가 영수증을 지급합니다.");
		Room room = hotelsystem.getRoomToString(client.getRegister_num());
		System.out.println(client.getName() + "님 이 묵으신 방"+ room.getRegister_num() +"번호의 지불 가격은" + client.payMoney + "입니다.");
		System.out.println("이용해 주셔서 감사합니다. 다음에도 이용해지시길 기다리겠습니다.");	
		client.catchBill(hotelsystem);
	}
}


