package kosa.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelSystem {
	public void addClient() {};
	public void cancelRoom() {};
	
	private ArrayList<Client> clientArr;
	private ArrayList<String> registerArr;
	private ArrayList<Room> roomArr;
	private ArrayList<Bill> billArr;
	private Money money;
	private Employee employee;
	private Register register;
	
	public HotelSystem() {
		super();
		clientArr = new ArrayList<Client>();
		registerArr = new ArrayList<String>();
		roomArr = new ArrayList<Room>();
		billArr = new ArrayList<Bill>();
		
		register = new Register();
		employee = new Employee();
		money = new Money();			
	}
	public HotelSystem(ArrayList<Client> clientArr, ArrayList<String> registerArr, ArrayList<Room> roomArr,
			ArrayList<Bill> billArr, Money money, Employee employee, Register register) {
		super();
		this.clientArr = clientArr;
		this.registerArr = registerArr;
		this.roomArr = roomArr;
		this.billArr = billArr;
		this.money = money;
		this.employee = employee;
		this.register = register;
	}
	public ArrayList<Client> getClientArr() {
		return clientArr;
	}
	public void setClientArr(ArrayList<Client> clientArr) {
		this.clientArr = clientArr;
	}
	public ArrayList<String> getRegisterArr() {
		return registerArr;
	}
	public void setRegisterArr(ArrayList<String> registerArr) {
		this.registerArr = registerArr;
	}
	public ArrayList<Room> getRoomArr() {
		return roomArr;
	}
	public void setRoomArr(ArrayList<Room> roomArr) {
		this.roomArr = roomArr;
	}
	public ArrayList<Bill> getBillArr() {
		return billArr;
	}
	public void setBillArr(ArrayList<Bill> billArr) {
		this.billArr = billArr;
	}
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
	}
	public void showRoomArr()
	{
		for (Room room : roomArr)
		{
			room.show();			
		}
	}
	
	public void showRegisterArr()
	{
		for (String info : registerArr)
		{
			System.out.println("예약된 예약 번호 + " + info );
		}
	}
	
	public void showBillArr()
	{
		for (Bill bill: billArr)
		{
			bill.show();
		}
	}
	
	public Room getRoomToString(String input_str)
	{
		
		for (int i=0; i < roomArr.size(); i++)
		{
			Room curRoom = roomArr.get(i);
			if (curRoom.getRegister_num().equals(input_str))
				return (curRoom);
		}
		return (null);
	}
	
	public void dayOff()
	{
		register.overRoom(this);
	}
}