package kosa.hotel;

public class Room {
	private int price;
	private String register_num;
	private String room_type;
	private boolean checkin_flag;
	private Client client;
	private int date;
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Room() {
		super();
	}
	public Room(int price, String room_type) {
		super();
		this.price = price;
		this.room_type = room_type;
		this.register_num = "";
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegister_num() {
		return register_num;
	}
	public void setRegister_num(String register_num) {
		this.register_num = register_num;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public boolean isCheckin_flag() {
		return checkin_flag;
	}
	public void setCheckin_flag(boolean checkin_flag) {
		this.checkin_flag = checkin_flag;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public void show() {
		System.out.print(room_type + " : " + price + "원 ");
		System.out.print("\t예약 상태 : ");
		if (register_num == "")
			System.out.print("빈방");
		else
			System.out.print("예약됨");
		System.out.print("\tCheck In : ");
		if (checkin_flag == true)
			System.out.println("O");
		else
			System.out.println("X");
	}
}