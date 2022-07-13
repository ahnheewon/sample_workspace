package co.edu.io.memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//등록, 조회, 삭제, 목록  기능을 담고 있다.
public class MemoManager implements Serializable { // 자바 직렬화 인터페이스를 사용

	List<Memo> memoStorage = new ArrayList<>();

	Scanner scn = new Scanner(System.in);
	File file = new File("c:/Dev/memo.dat"); // File 클래스 생성.

	// 싱글톤
	private static MemoManager instance = new MemoManager();
	
	private MemoManager() {
	// 파일정보 => ArrayList
	readFromfile();
	}
	
	public static MemoManager getInstance() {
		return instance;

	}

// 메모등록
	public void inputData() {
		System.out.println("메모번호> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("작성날짜> ");
		String date = scn.nextLine();
		System.out.println("내용입력> ");
		String content = scn.nextLine();

		memoStorage.add(new Memo(no, date, content));
	}

// 날짜 입력하고 모든 메모 출력.
	public void search() {
		System.out.println("날짜입력> ");
		String date = scn.nextLine();

		boolean isExist = false; // 메모가 있으면 true

		for (int i = 0; i < memoStorage.size(); i++) {
			if (date.equals(memoStorage.get(i).getDate()))
				// memoStorage안에 들어있는 숫자 중에 Date를 캐치
				System.out.println(memoStorage.get(i).toString());
			isExist = true;
		}
		if (isExist == false)
			System.out.println("해당 날짜의 메모가 없습니다.");
		// 이렇게 따로 분리해둬야 이 문구가 여러개 안뜸.
	}

// 번호를 입력 후 -> 삭제
	public void deleteData() {
		System.out.println("삭제할 메모의 번호입력> ");
		int delNo = Integer.parseInt(scn.nextLine());

		Iterator<Memo> itr = memoStorage.iterator(); // 반복자 선언
		while (itr.hasNext()) {
			Memo memo = itr.next();
			if (memo.getNo() == delNo) {
				itr.remove();
				System.out.println("삭제완료.");
				return;
			} // 일치하는 게 있으면 이미 삭제된 상태.
		}
		System.out.println("일치하는 번호가 없습니다.");

	}

// 시스템 종료. 작성한 메모를 보냄.

	public void storeToFile() {

		try {
			FileOutputStream fos = new FileOutputStream(file);

			// 객체처리해주는 보조스트림
			// ObjectOutPutStream : ArrayList => 바이트배열 변경. (직렬화)

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(memoStorage);
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

// 파일정보를 받아서 => 컬렉션타입으로.
	public void readFromfile() {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis); // 보조스트림 간단하게 읽어올 수 있다.

			memoStorage = (List<Memo>) ois.readObject();

			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
