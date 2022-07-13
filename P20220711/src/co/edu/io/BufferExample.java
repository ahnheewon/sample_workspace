package co.edu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 보조스트림 생성. 바이트 기반 => 문자 기반 (InputStreamReader, OutputStreamWriter)
 * 				버퍼스트림(성능향상)
 */
public class BufferExample {

	public static void main(String[] args) {

		bufferReaderWriter();
		// streamToReader();
	}

	// 버퍼스트림
	public static void bufferReaderWriter() {
		try {

			// 읽기 용도
			FileInputStream fis = new FileInputStream("c:/Dev/image.png"); // 기본스트림
			BufferedInputStream bis = new BufferedInputStream(fis); // 보조 스트림

			// 쓰기 용도
			FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png");// 기본스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos);// 보조 스트림

			while (true) {
				int bt = bis.read();
				if (bt == -1) {
					break;
				}
				bos.write(bt);
			}
			bos.flush();
			bos.close();
			bis.close();
			fis.close();
			fos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");

	}

	public static void streamToReader() {

		InputStream is = System.in; // 키보드 입력.
		InputStreamReader isr = new InputStreamReader(is); // 키보드 입력.
		char[] cbuf = new char[10];
		System.out.println("입력> ");
		try {

			int b = isr.read(cbuf); // 읽어들인 만큼 리턴.
			for (int i = 0; i < b; i++)
				System.out.print((char) cbuf[i]);

			System.out.println();
			isr.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	public static void streamToWriter() {
		// 바이트 스트림 -> 문자 스트림.
		OutputStream os = System.out; // 키보드 입력.
		OutputStreamWriter osw = new OutputStreamWriter(os);

		Scanner scn = new Scanner(System.in);
		System.out.println("입력> ");
		String text = scn.nextLine();

		try {
			osw.write(text + "\n");
			osw.write("실행완료");
			osw.flush();
			osw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
