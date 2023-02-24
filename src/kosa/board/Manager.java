package kosa.board;

import java.util.Scanner;

public class Manager {
	int count;
	static Scanner sc = new Scanner(System.in);
	Board boardList[] = new Board[100];
	
	int answerCount;
	Answer answer[] = new Answer[100];
	
	public void write() {
		System.out.print("글 제목: ");
		String name = sc.nextLine();
		System.out.print("작성자: ");
		String writer = sc.nextLine();
		System.out.print("글 내용: ");
		String content = sc.nextLine();
		int number = count;
		
		boardList[count++] = new Board(number,name,writer,content);

	}
	
	public void list() {
		for(int i=0; i<count; i++) {
			System.out.print("번호 :");
			System.out.print(boardList[i].getNumber()+1);
			System.out.print(", 글 제목 :");
			System.out.println(boardList[i].getTitle());
		}
		
	}
	
	
	public void detail() {
		System.out.println("글번호를 입력해주세요: ");
		int number = sc.nextInt();
		int idx = -1;
		
		for(int i=0; i<count; i++) {
			System.out.println("boardList[i].getNumber()데이터 확인"+boardList[i].getNumber());
			if(number == boardList[i].getNumber()+1){
				boardList[i].show();
				idx = i;
				break;
			}
		}
		
		//만약 답변 작성하시겠습니까? 아니면 넘어가시겠습니까?
		if(idx == -1) {
			System.out.println("해당 검색어가 존재하지 않습니다.");
		}else {
			anwserWrite();
		}
	}
	
	public void anwserWrite() {
		System.out.print("답변을 작성하시겠습니까? ");
		String yn = sc.nextLine();
		
		String content = sc.nextLine();
		
		if(yn == "y") {
			
		}else {
			return;
		}
	}

}
