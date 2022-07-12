package co.edu.collect.board;
/*
 * 
 * 글제목, 작성자, 내용.
 * 
 * Board클래스 : 데이터를 담아주는 용도.
 * BoardDAO : 데이터의 입출력을 담당.
 * BoardApp : main메소드를 담고 있는 클래스.
 * 	<1. 목록 2. 등록 3.조회(작성자) 4.삭제 5.종료>
 * 
 */

public class Board {
	private String title;
	private String writer;
	private String content; // 필드

	// 필드의 값을 채워주는 생성자
	public Board(String title, String writer, String content) {

		this.title = title;
		this.writer = writer;
		this.content = content;	
	
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

	@Override
	public String toString() {
		return "Board [title=" + title + ", writer=" + writer + ", content=" + content + "]";
	}
	
}
