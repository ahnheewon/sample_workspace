package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExample {

	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");
			//위 파일을 받아서 아래파일에 쓰겠습니다.
			FileOutputStream fos = new FileOutputStream("c:/Dev/image3.png");
			byte[] buff = new byte[10000];
			
			while (true) {
				int buf = fis.read(buff);
				if (buf == -1) {
					break;
				}

				fos.write(buff);
			}
			fos.flush();
			fos.close();
			fis.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("데이터 처리 시간 :"+(end-start)+"나노");
	}

	// byte기반 출력 스트림.
	public static void write1() {

		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;

			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("실행완료.");
	}

	// byte기반 입력 스트림.
	public static void read1() {

		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");
			// 아까 만든 FileOutputStream 읽어오는?
			while (true) {
				int buf = fis.read();

				if (buf == -1) { // 더이상 읽어올 값이 없으면 그만한다.
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행합니다.");

	}

	// byte기반 배열 입력 스트림
	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");

			byte[] arr = new byte[2]; // 크기가 2인 배열 arr
			while (true) {

				int buf = fis.read(arr); // {10,20,30} 배열의 크기만큼(2바이트씩) 읽는다.
				if (buf == -1)
					break;
				for (int i = 0; i < buf; i++) {// 읽은 배열의 크기만큼 리턴.
					System.out.println(arr[i]);
				}
				// System.out.println();
			}
			fis.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("실행.");

	}

	// byte기반 배열 출력 스트림
	public static void write2() {

		byte[] arr = { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr);
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

}
