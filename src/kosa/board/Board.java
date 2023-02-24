package kosa.board;

public class Board {
	private int number;
	private String title;
	private String writer;
	private String content;
	private Answer answerContent;
	
	public Board() {
		super();
	}

	public Board(int number, String title, String writer, String content) {
		super();
		this.number = number;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	public void answerWrite(Answer answer) {
		answerContent = answer;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void show() {
//		System.out.println("글 번호 : " + number);
		System.out.println("글 제목 : " + title);
		System.out.println("작성자 : " + writer);
		System.out.println("글 내용 : " + content);
	}

}
