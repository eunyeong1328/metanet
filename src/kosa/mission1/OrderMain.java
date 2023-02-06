package kosa.mission1;

public class OrderMain {

	public static void main(String[] args) {
		Member m = new Member("홍길도","가산");
		Item i = new Item("갤럭시23",100);
		Order o = new Order(1,m,i,100);
		
		o.show();

	}

}
