package kosa.hotel;

import java.util.Scanner;

public class Register {
	
	public String registerRoom(HotelSystem hotel, Client client) {
		if (client.getRegister_num().equals("") == false)
		{
			System.out.println("해당 고객은 이미 방을 예약했습니다");
			return (null);
		}
		
		System.out.println("현재 예약 정보");
		hotel.showRoomArr();
		System.out.print("예약할 방 종류를 선택하세요 (N S) :");
		Scanner sc = new Scanner(System.in);
		String input_str = sc.nextLine();
		if (input_str.equals("N") || input_str.equals("S"))
		{
			String room_type = input_str;
			for (int i=0; i < hotel.getRoomArr().size(); i++)
			{
				Room curRoom = hotel.getRoomArr().get(i);
				if (curRoom.getRoom_type().equals(room_type) && curRoom.getRegister_num().equals("") )
				{
					String register_num = Integer.toString(i+1000);
					curRoom.setRegister_num(register_num);
					curRoom.setClient(client);
					hotel.getRegisterArr().add(register_num);
					
					System.out.println(input_str+"방을 예약하셨습니다. 예약 번호 : " + register_num);		
					return (register_num);
				}
			}
			System.out.println("해당 방 종류는 만석입니다.");
			return (null);			
		}
		else
			System.out.println("잘못된 입력입니다.");
		return (null);
	}
	
	public void cancelRoom(HotelSystem hotel, Client client) {
		if (client.getRegister_num().equals("") )
		{
			System.out.println("해당 고객은 예약 상태가 아닙니다.");
			return;
		}
		System.out.println("예약을 취소하실 고객님의 예약번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String input_str = sc.nextLine();
		if (client.getRegister_num().equals(input_str))
		{
			Room curRoom = hotel.getRoomToString(input_str);
			
			// 호텔의 객실 객체 초기화
			curRoom.setClient(new Client());
			curRoom.setRegister_num("");
			curRoom.setCheckin_flag(false);
			
			// 호텔의 예약 정보 제거
			for (int i=0; i < hotel.getRegisterArr().size(); i++)
			{
				String loop_reg = hotel.getRegisterArr().get(i);
				if (loop_reg.equals(input_str))
				{
					hotel.getRegisterArr().remove(i);
					break;
				}
			}
			//클라이언트의 예약 정보 제거
			client.setRegister_num("");
			System.out.println("성공적으로 예약을 취소하였습니다.");
			return;
		}
		System.out.println("잘못된 예약번호를 입력하셨습니다.");	
		return;
	}
	
	public void overRoom(HotelSystem hotel) {
		System.out.println("예약 당담자가 방을 조사합니다");
		
		for (int i=0; i<hotel.getRegisterArr().size(); i++)
		{
			String regInfo = hotel.getRegisterArr().get(i);
			Room room = hotel.getRoomToString(regInfo);
			room.show();
			if(room.isCheckin_flag() == false)
			{
				System.out.println("해당 객실은 " + room.getClient().getName() + "고객이 체크인 하지않았습니다.");
				System.out.println("객실의 예약을 취소합니다");
				
				//클라이언트 예약 정보 초기화
				room.getClient().setRegister_num("");
				
				//객실정보 초기화
				room.setClient(new Client());
				room.setRegister_num("");
				room.setCheckin_flag(false);
				
				//예약정보 삭제
				hotel.getRegisterArr().remove(i);
			}
			else
				room.setDate(room.getDate() + 1);			
		}
	}
}