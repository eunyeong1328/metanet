package kosa.board1;

public class BoardMain {

	public static void main(String[] args) {
		MySQLDao m = new MySQLDao();
		OracleDao o = new OracleDao();
		
		m.insert();
		o.insert();
	}

}
