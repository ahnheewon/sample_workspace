package co.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf = new char[10];
			int buf = 0;
			while ((buf = fr.read(cbuf)) != -1) { // buf가 -1이 아니면, 
				                                  // 즉 읽을 수 있는 값이 있으면계속 반복하라.
				for (int i = 0; i < buf; i++) {
					System.out.print(cbuf[i]);  // 읽어들인 배열의 크기 만큼 반복문을 통해서
				}
			//	System.out.println();
			}
			fr.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		System.out.println("실행.");
	}

	public static void writer1() {

		Scanner scn = new Scanner(System.in);
		System.out.println("입력> ");
		String txt = "";
		try {
			FileWriter fw = new FileWriter("c:/Dev/test.txt");

			while (true) {
				try {
					txt = scn.nextLine();
				} catch (NoSuchElementException e) { // 요소가 없을 때 에러
					break;
				}
				fw.write(txt + "\n");
			}
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행합니다.");
	}

	public static void reader1() {

		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");

			while (true) {
				int buf = fr.read(); // test.txt 의 값을 2바이트씩 읽고
										// int(4바이트)타입으로 리턴한다.
				if (buf == -1) {
					break;
				}
				System.out.println((char) buf);// 문자열로 출력
			}
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("실행");
	}

}
