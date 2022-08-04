package com.yedam.common.member;

//DTO(Data transfer object)
//BEANS
public class Member {
//멤버를 조회하기 위해 만든 클래스

	//필드
	private String id;
	private String pw;
	private String name;

	// 생성자

	// 메소드

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "회원정보 [ID:" + id + ", 패스워드:" + pw + ", 이름:" + name + "]";
	}

}
