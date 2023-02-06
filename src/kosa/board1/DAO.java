package kosa.board1;

public class DAO {
	BoardService boardService;
	
	public DAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DAO(BoardService boardService) {
		super();
		this.boardService = boardService;
	}

	public void insertBoard() {
		boardService.insert();
	}
	

}
