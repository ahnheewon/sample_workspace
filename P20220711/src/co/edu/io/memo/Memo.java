package co.edu.io.memo;

import java.io.Serializable;

/*
 * 메모번호, 날짜시간, 메모내용
 */
public class Memo implements Serializable{

	// 필드 선언
	private int no;
	private String date;
	private String content;

	// 생성자 선언
	// 클래스 이름과 같은 메소드 만들기
	public Memo(int no, String date, String content) {
		
		this.no = no;
		this.date = date;
		this.content = content;
		
	}

	public Memo() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "메모 [번호 : " + no + ", 날짜 :" + date + ", 내용 : " + content + "]";
	}
	
	
	
}
