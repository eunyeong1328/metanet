package kosa.board;

public class Answer {
	private Board board;
	private String content;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(Board board, String content) {
		super();
		this.board = board;
		this.content = content;
	}
	
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public void show() {
		System.out.println("답변 내용 :" + content);
	}
	
	

}
