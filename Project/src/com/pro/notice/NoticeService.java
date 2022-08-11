package com.pro.notice;

import java.util.List;
import java.util.Scanner;

import com.pro.member.MemberService;

public class NoticeService { // 공지사항 관련 서비스

	Scanner sc = new Scanner(System.in);

	public void getNotice() {
		Notice notice = new Notice();
		List<Notice> list = NoticeManage.getInstance().getListNotice();
		System.out.println("공지사항을 불러옵니다...");
		System.out.println("=====================================================================");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			System.out.println("=====================================================================");
		}
		if (list.size() == 0) {
			System.out.println("   ....... 조회할 수 있는 글이 없습니다 ┌⊙◇⊙┘ .......");
			System.out.println("=====================================================================");
		}

	}

	public void createNotice() {
		Notice notice = new Notice();
		System.out.println("공지사항 작성 중......");
		System.out.println("공지사항 제목 > ");
		String boardName = sc.nextLine();

		System.out.println("공지사항 내용 > ");

		String result0 = "";
		String noticeContents = "\n";
		System.out.println("내용을 입력하세요. 종료를 원하면 공백을 쳐주세요.");
		System.out.println("입력>");
		while (true) { // 엔터 쳐도 이어서 쓸 수 있게 해야 함.
			String plus = sc.nextLine();
			if (plus.equals(" ")) {
				result0 = noticeContents;
				break;
			} else
				plus = plus + "\n";
			noticeContents = noticeContents + plus;

		}
		notice.setNoticeName(boardName);
		notice.setNoticeContents(noticeContents); // 엔터 쳐도 이어서 쓸 수 있게 해야 함.
		notice.setMemberName(MemberService.memberInfo.getMemberName());

		int result = NoticeManage.getInstance().makeNotice(notice);
		if (result == 1) {
			System.out.println("공지사항 등록 성공");
		} else
			System.out.println("공지사항 등록 실패");

	}

	public void noticeDeepInfo() { ///// 글 자세히 조회
		System.out.println("몇 번째 글을 조회하겠습니까?");
		int num = Integer.parseInt(sc.nextLine());

		List<Notice> list = NoticeManage.getInstance().getListNotice();
		System.out.println("-------------------------------------------------------------------");
		System.out.println(list.get(num - 1).toString());
		System.out.println("-------------------------------------------------------------------");
		System.out.println(list.get(num - 1).getNoticeContents());
		System.out.println("-------------------------------------------------------------------");

	}

	public void deleteNotice() {
		Notice ntc = new Notice();
		System.out.println("삭제할 공지 번호 입력>");
		int noticeId = Integer.parseInt(sc.nextLine());

		int result = NoticeManage.getInstance().deleteNotice(noticeId);
		if (result != 0) {
			System.out.println("해당 공지사항을 삭제 했습니다.");
		} else
			System.out.println("삭제 실패 ");
	}
}
