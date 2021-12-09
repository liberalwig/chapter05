//2021.12.9(목)10:30수업,01.I/O Stream중 character buffered stream

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine(); // 한 줄씩 읽어온다: 줄바꿈은 제외함
			if (str == null) {
				break;
			}

			System.out.println(str);
		}

		br.close();
	}

}
