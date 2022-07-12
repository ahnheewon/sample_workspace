package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;

/*
 * 목록 등록 조회(작성자) 삭제 
 */

public class BoardDAO {
// 싱글톤. getinstace

	private static BoardDAO instance = new BoardDAO();
	List<Board> list;

	private BoardDAO() {
		list = new ArrayList<>();
	} // instance 할당

	public static BoardDAO getinstance() {
		return instance;
	}

// 1. 목록
	public List<Board> boardList() {
		return list;
	}

// 2. 등록
	public void add(Board board) {
		list.add(board);
	}
// 3. 조회(작성자)
public List<Board> search(String writer) {
	//writer 매개값과 일치하면 컬렉션타입으로 반환
	List<Board> list = new ArrayList<>(); //찾고자 하는 이름 => 리스트
	
	for(Board board : this.list) {
		if(board.getWriter().equals(writer)) {
			list.add(board); // 이름이 같은 애들을 리스트에 추가
		}
	}
	return list;
	
}
	
// 4. 삭제(제목)
public void remove(String title) {
	for (int i=0; i<list.size(); i++) {
		if(list.get(i).getTitle().equals(title)) {
			list.remove(i);
			break;
		}
	}

}

}
