package kosa.bank;

public class MyBank {
	private Customer customers[];
	private int customersNum;
	
	public MyBank() {
		customers = new Customer[100];
	}
	
	public void addCustomer(String id, String name, long balance) {
		customers[customersNum++] = new Customer(id,name,balance);
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null; //지역변수 생성 <- 가독성을 높이고 싶다면
		for(int i=0; i<customersNum; i++) {
			System.out.println("getCustomer : "+customers[i].getId());
			if(customers[i].getId().equals(id)) {
				cust = customers[i];
				break;
			}
		}
		return cust;
	}
	
	
	public Customer[] getAllCustomers(){
		Customer newCust[] = new Customer[customersNum];
		
		for(int i=0; i<newCust.length;i++) {
			newCust[i] = customers[i];
		}
		//api 사용
		//원본배열 ,새배열, 복사 처음부터, 몇개 복사?
//		System.arraycopy(customers, 0, newCust, 0, customersNum);
		return newCust;
	}

	public MyBank(Customer[] customers, int customersNum) {
		super();
		this.customers = customers;
		this.customersNum = customersNum;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}
	
	
	

}
