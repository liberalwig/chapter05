//2021.12.8(수)수업, 01.I/O Stream 중 byte stream

package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		// 파일이 없을 때를 대비해서 예외처리 try-catch를 해줘야 함
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");

		byte[] buff = new byte[1024];
		System.out.println("복사를 시작합니다.");
		while (true) {
			int data = in.read(buff);

			if (data == -1) {
				System.out.println("복사가 완료되었습니다." + data);
				break;
			}
			out.write(buff);
		}

		/*
		 * System.out.println("복사를 시작합니다."); while (true) { int data = in.read();
		 * 
		 * if (data == -1) { System.out.println("복사가 완료되었습니다." + data); break; }
		 * out.write(data);
		 */

		in.close();
		out.close();
	}

}
