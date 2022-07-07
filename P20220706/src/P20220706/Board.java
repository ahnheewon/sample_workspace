package P20220706;

import java.util.Date;

/*
 * 
 * 게시글 한 건의 정보.
 * 게시글 제목/ 내용/ 작성자/ 작성일시/ 조회수
 * 
 */

public class Board {
	// 필드.
	private String title;
	private String content;
	private String writer;
	private Date createDate;
	private int hitCount;

	// 생성자. -> 생성자 정의 안하면 기본 생성자가 생성된다!!

	// getter, setter

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getHitCount() {
		return hitCount;
	}

	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}

}
