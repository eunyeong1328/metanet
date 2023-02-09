package kosa.hotel;

import java.util.Scanner;

public class Main {
	static int global_registerNum = 1;
	
	public static void main(String[] args) {
		
		Client clientArr[] = {
			new Client("홍길동", new Money(10000, 10000, 10000)),
			new Client("김길동", new Money(15000, 15000, 15000)),
			new Client("고길동", new Money(20000, 20000, 20000)),
		};
		
		HotelSystem hotel = new HotelSystem();
		hotel.getRoomArr().add(new Room(50000, "N"));
		hotel.getRoomArr().add(new Room(50000, "N"));
		hotel.getRoomArr().add(new Room(50000, "N"));
		hotel.getRoomArr().add(new Room(70000, "S"));
		hotel.getRoomArr().add(new Room(70000, "S"));
		
		Scanner sc = new Scanner(System.in);
		String input_str;		
		
		while (true)
		{
			System.out.println("고객 선택");
			System.out.print("1.홍길동  2.김길동 3.고길동 4.시스템 5.종료");
			input_str = sc.nextLine();
			
			Client curClient = null;
			
			switch (input_str) {
			case "1" : case "2" : case "3":
				curClient = clientArr[Integer.parseInt(input_str) - 1];
				break;
			case "4":
				System.out.println("시스템 정보");
				break;
			case "5":
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			if (input_str.equals("4"))
			{
				System.out.print("1.객실 정보  출력 2.예약 번호 정보 출력 3.영수증 정보 출력 4.하루 보내기");	
				
				input_str = sc.nextLine();
				switch (input_str) {
				case "1" :
					System.out.println("호텔이 가진 객실정보를 출력합니다.");
					hotel.showRoomArr();
					break;
				case "2" :
					System.out.println("호텔에 예약된 예약 번호를 출력합니다.");
					hotel.showRegisterArr();
					break;
				case "3" :
					System.out.println("호텔이 가지고 있는 영수증을 출력합니다.");
					hotel.showBillArr();
					break;
				case "4" :
					System.out.println("호텔의 하루가 지나갑니다.");
					hotel.dayOff();
					break;
				}
			}
			
			if (curClient != null)
			{
				System.out.println("현재 고객");
				curClient.show();
				
				Register register = hotel.getRegister();
				
				System.out.print("1.객실 예약  2.예약 취소 3.체크인 4.체크아웃 5.취소 :");	
				input_str = sc.nextLine();
				switch (input_str) {
				case "1" : 
					System.out.println("1. 객실 예약");
					String ret = register.registerRoom(hotel, curClient);
					if (ret != null)
						curClient.setRegister_num(ret);
					break;
					
				case "2" : 
					System.out.println("2. 예약 취소");
					register.cancelRoom(hotel, curClient);
					break;
						
				case "3":
					System.out.println("3. 체크인");
					curClient.checkIn(hotel);				
					break;
				case "4":
					System.out.println("4. 체크아웃");
					curClient.checkOut(hotel);
					break;
				case "5":
					System.out.println("고객 입력 취소.");
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}
			}
		}
	}
}