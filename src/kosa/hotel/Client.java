package kosa.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
	
	Scanner sc = new Scanner(System.in);
	
	private String name;
	private String register_num;
	private Money money;
	private Bill bill;
	private ArrayList<Bill> after_bills;
	
	int paid_cash = 0;
	int paid_card = 0;
	int paid_supyo = 0;
	int payMoney = 0; 
			
	public void registerRoom() {}
	
	public void cancelRoom() {}
		
	public void checkIn() {}
	String roomNumber;
	public void checkIn(HotelSystem hotelSystem) { 
		//1이면 체크인 가능, 0이면 체크인 불가능
		int check = 1;
		if(check ==  1) {
			System.out.println("예약번호를 입력해주세요"); 
			String check_num = sc.nextLine();
			if(register_num.equals(check_num)) {
				System.out.println("예약번호가 확인되었습니다.");
				for(int i =0; i< hotelSystem.getRoomArr().size(); i++) { 
					Room room =  hotelSystem.getRoomArr().get(i);
					roomNumber = room.getRegister_num();
					
					if (room.getRegister_num().equals(check_num) )
					{						
						if(hotelSystem.getRoomArr().get(i).isCheckin_flag() == true) {
							System.out.println(roomNumber + "번 방이 등록되어 있습니다.");
						}
						else {
							room.setCheckin_flag(true);
							System.out.println(roomNumber + "번 방 체크인 되었습니다");
						}
					}
				}
			}
		}else if(check == 0) {
			System.out.println("체크인이 불가합니다. 예약번호를 다시 입력해주세요");
		}	
	}
	
	//체크 아웃
	public void checkOut(HotelSystem hotel) {
		//flag 0이면 꽉찬방 1이면 빈방
		System.out.println("체크 아웃 하시겠습니까? 1. 네  2. 아니요");	
		System.out.print("입력해주세요: ");
		String input = sc.nextLine();
		if(input.equals("1")) {
			System.out.println("객실 번호를 입력해주세요");
			System.out.print("객실 번호 입력: ");
			input = sc.nextLine();			
			if(register_num.equals(input) ) {
				System.out.println("체크 아웃이 완료되었습니다. 숙박비를 수납해주세요");
				Room curRoom;
				for (int i=0; i < hotel.getRoomArr().size(); i++)
				{
					curRoom = hotel.getRoomArr().get(i);
					if (curRoom.getRegister_num().equals(register_num))
					{		
						payMoney = curRoom.getPrice();
						calRoom(hotel, payMoney, curRoom);
						return;
					}
				}
			}
			return;
		}else if(input.equals("2")) {
			System.out.println("체크 아웃을 종료합니다.");
		}else {
			System.out.println("잘못 입력되었습니다.");
		}		
	}
	
	//숙박비 지불 
	public Money calRoom(HotelSystem hotelSystem, int payMoney, Room room) {		
		int payMony = room.getPrice();		
		System.out.println("어떤 방식으로 결제하시겠습니까?");
		System.out.println("1. 현금   2. 수표   3. 신용카드");
		System.out.print("결제 방식을 선택해주세요: ");		
		Money money2 = new Money(); //내가 제출해야되는돈
		
		while(true) {
			String input = sc.nextLine();
			if(input.equals("1")) {
				System.out.println("현금으로 결제합니다");
				System.out.println("가지고 계신 금액은: " + money.getCash() + "이며 지불되야 되는 금액은 " + payMony + " 입니다");
				if(money.getCash() < payMony) {
					System.out.println("금액이 부족합니다.");
				}
				else if(money.getCash() >= payMony) {			
					money.setCash(money.getCash() - payMony);
					System.out.println("지불이 완료되었습니다. 잔금 : " + money.getCash());
					paid_cash += payMony;
					bill.setPaid_cash(paid_cash);
					money2.setCash(paid_cash);
					hotelSystem.getMoney().setCash(hotelSystem.getMoney().getCash() + paid_cash);	
					
					break;
				}
			}
			else if(input.equals("2")) {
				System.out.println("수표로 결제합니다");
				System.out.println("가지고 계신 금액은: " + money.getSupyo() + "이며 지불되야 되는 금액은 " + payMony + " 입니다");
				if(money.getSupyo() < payMony || money.getSupyo() < 100000) {
					System.out.println("금액이 부족합니다.");
				}else if(money.getSupyo() >= payMony) {			
					int supyo =  money.getSupyo() - payMony;
					money.setSupyo(supyo);
					System.out.println("지불이 완료되었습니다. 잔금 : " + money.getSupyo());
					paid_supyo += payMony;
					bill.setPaid_supyo(paid_supyo);
					money2.setSupyo(paid_cash);
					hotelSystem.getMoney().setSupyo(hotelSystem.getMoney().getSupyo() + paid_supyo);	
					
					break;
				}	
				
			}
			else if(input.equals("3")) {
				System.out.println("카드로 결제합니다");
				System.out.println("지불되야 되는 금액은 " + payMony + " 입니다");			
					int card =  money.getCard() - payMony;
					money.setCard(card);;
					System.out.println("지불이 완료되었습니다.");	
					paid_card += payMony;
					bill.setPaid_card(paid_card);
					money2.setCard(paid_card);
					hotelSystem.getMoney().setCard(hotelSystem.getMoney().getCard()+paid_card);						
					break;
				}
			else
				System.out.println("잘못 입력되었습니다.");
		}
		Employee employee = hotelSystem.getEmployee();
		employee.payBill(hotelSystem,this);
		for (int i=0; i < hotelSystem.getRegisterArr().size(); i++)
		{
			String loop_reg = hotelSystem.getRegisterArr().get(i);
			if (loop_reg.equals(getRegister_num()))
			{
				hotelSystem.getRegisterArr().remove(i);
				break;
			}
		}
		this.setRegister_num("");
		room.setCheckin_flag(false);
		room.setRegister_num("");
		room.setClient(new Client());
		return money2;
	}
	
	//영수증 수령
	public void catchBill(HotelSystem hotelsystem) {
		System.out.println("영수증을 수령합니다");
		after_bills.add(bill);  // 클라이언트가 가진 영수증들 배열
		hotelsystem.getBillArr().add(bill);
//		hotelsystem.setBillArr(after_bills);
		System.out.println(" - END - ");
		return;
	}
	
	public Client() {
		this.money = new Money();
		this.bill = new Bill();
		this.after_bills = new ArrayList<Bill>();
	}
	
	public Client(String name, Money money) {
		super();
		this.name = name;
		this.register_num = "";
		this.money = money;
		this.bill = new Bill();
		this.after_bills = new ArrayList<Bill>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegister_num() {
		return register_num;
	}
	public void setRegister_num(String register_num) {
		this.register_num = register_num;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public ArrayList<Bill> getAfter_bills() {
		return after_bills;
	}
	public void setAfter_bills(ArrayList<Bill> after_bills) {
		this.after_bills = after_bills;
	}
	
	public void show()
	{
		System.out.println("이름 :" + name);
		System.out.println("예약번호 :" + register_num);
		money.show();
		if (after_bills.isEmpty() == false)
		{
			for(Bill bill : after_bills)
			{
				bill.show();
				System.out.println("---------------");
			}
		}
	}
}