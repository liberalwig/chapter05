//2021.12.8(수) 17:00수업, 01.I/O Stream중 buffered stream

package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);// buffered와 InputStream의 연결고리로(in)생성

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		System.out.println("복사를 시작합니다.");
		while (true) {
			int data = bin.read();
			if (data == -1) {
				System.out.println("복사가 완료되었습니다." + data);
				break;
			}
			bout.write(data);

		}

		bin.close();
		bout.close();// 가까이 있는 buffered용을 지우면 알아서 in,out 빨대들은 닫아줌
	}

}
