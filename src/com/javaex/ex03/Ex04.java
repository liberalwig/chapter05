//2021.12.9(목)12:05

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("/Users/hs/JavaStudy/file/PhoneDB_ 원본.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			String[] sArray = str.split(",");
			String name = sArray[0];
			String hp = sArray[1];
			String company = sArray[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
		}
		br.close();
	}

}